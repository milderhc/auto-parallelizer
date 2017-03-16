package util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.json.*;
import java.io.*;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by milderhc on 14/03/17.
 */
public class CodeAcquirer {

    public static final String INPUT_CODE_FOLDER = "input-code";

    private final String KEY = "0f7bea9e70d1a3282ad4a20767d3bb515609f2fa";
    private final String SECRET = ":v";
    private final String PREFIX = "http://codeforces.com/api/";

    private String sha512Hex (String s) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        byte bytes[] = md.digest(s.getBytes("UTF-8"));

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++){
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    private String getRequestString(String method, List<String> paramNames,
                                    List<String> paramValues, boolean anonymous)
                                    throws Exception {

        if (paramNames.size() != paramValues.size())
            throw new Exception("Different number of values and params");

        if (anonymous) {
            StringBuilder requestString = new StringBuilder();
            requestString.append(PREFIX + method + "?");
            for (int i = 0; i < paramNames.size(); ++i) {
                if (i > 0)
                    requestString.append("&");
                requestString.append(paramNames.get(i) + "=" + paramValues.get(i));
            }
            return requestString.toString();
        }

        List<String> params = new ArrayList<>();
        params.add("time=" + System.currentTimeMillis() / 1000);
        params.add("apiKey=" + KEY);
        for (int i = 0; i < paramNames.size(); ++i) {
            params.add(paramNames.get(i) + "=" + paramValues.get(i));
        }
        Collections.sort(params);

        String begin = "875784";
        StringBuilder paramsString = new StringBuilder(begin + "/" + method + "?");
        StringBuilder requestString = new StringBuilder(PREFIX + method + "?");
        for (int i = 0; i < params.size(); ++i) {
            if (i > 0) {
                paramsString.append("&");
                requestString.append("&");
            }
            paramsString.append(params.get(i));
            requestString.append(params.get(i));
        }
        paramsString.append("#" + SECRET);
        requestString.append("&apiSig=" + begin + sha512Hex(paramsString.toString()));
        return requestString.toString();
    }

    private JsonArray makeRequest (String request) throws IOException {
        URL url = new URL(request);
        InputStream inputStream = url.openStream();
        JsonReader reader = Json.createReader(inputStream);
        JsonObject mainObject = reader.readObject();
        return mainObject.getJsonArray("result");
    }

    /***
     * Returns a JsonArray containing the info about solutions of a specified handle
     * @param handle
     * @param from
     * @param count number of solutions to get
     * @return
     * @throws Exception
     */
    public JsonArray getSubmissions(String handle, int from, int count) throws Exception {
        String method = "user.status";
        ArrayList<String> params = new ArrayList<>(),
                          valueParams = new ArrayList<>();
        params.add("handle"); valueParams.add(handle);
        params.add("from"); valueParams.add(String.valueOf(from));
        params.add("count"); valueParams.add(String.valueOf(count));

        String request = getRequestString(method, params, valueParams, true);
        System.out.println(request);

        return makeRequest(request);
    }

    /***
     * Gets a specific solution code from codeforces.com
     * @param contestId
     * @param submissionId
     * @return code of specified solution
     * @throws IOException
     */
    public String getCode (String contestId, String submissionId) throws IOException {
        String prefix = "http://codeforces.com/contest/";
        String request = prefix + contestId + "/submission/" + submissionId;
        Document doc = Jsoup.connect(request).get();
        Elements prettyprint = doc.getElementsByClass("prettyprint");
        return prettyprint.select("pre").text();
    }

    /***
     * Prints a bunch of solutions submitted by handle
     * @param handle
     * @param from
     * @param count
     * @throws Exception
     */
    public void printCodeSubmission (String handle, int from, int count) throws Exception {
        JsonArray submissions = getSubmissions(handle, from, count);
        createFolderForUser(handle);

        StringBuilder sources = new StringBuilder();

        for (JsonObject result : submissions.getValuesAs(JsonObject.class)) {
            JsonNumber id = result.getJsonNumber("id");
            JsonNumber contestId = result.getJsonNumber("contestId");
            JsonString verdict = result.getJsonString("verdict");
            JsonString index = result.getJsonObject("problem").getJsonString("index");
            JsonString programmingLanguage = result.getJsonString("programmingLanguage");

            //If the code got Accepted and is written in C++
            if (programmingLanguage.getString().indexOf("C++") != -1 &&
                    verdict.getString().equals("OK")) {
                String code = getCode(contestId.toString(), id.toString());
                sources.append(
                        printCodeToFile(handle, contestId.intValue(), index.getString(), code) + "\n");
            }
        }

        printToFile(INPUT_CODE_FOLDER + "/" + handle + "/" + "sources.txt",
                sources.toString());
    }

    private void createFolderForUser (String handle) {
        File folder = new File(INPUT_CODE_FOLDER + "/" + handle);
        if (!folder.exists()) {
            System.out.println("Creating directory for: " + folder.getName());
            folder.mkdir();
        }
    }

    public String printCodeToFile (String handle, int contestId, String index, String code) throws FileNotFoundException, UnsupportedEncodingException {
        String filename = contestId + index + ".cpp";
        String folder = INPUT_CODE_FOLDER + "/" + handle + "/";
        printToFile(folder + filename, code);
        return folder + filename;
    }

    public void printToFile (String filename, String s) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(filename, "UTF-8");
        writer.print(s);
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        CodeAcquirer codeAcquirer = new CodeAcquirer();
        codeAcquirer.printCodeSubmission("mavd09", 1, 10);
    }
}
