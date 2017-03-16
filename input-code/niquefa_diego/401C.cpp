#include <bits/stdc++.h>
using namespace std;

int main () {
    int cnt0, cnt1;
    cin >> cnt0 >> cnt1;
    if ( cnt1 < cnt0-1 ) cout << "-1\n";
    else if ( cnt1 > (cnt0+1)*2 ) cout << "-1\n";
    else {
        string s;
        int k = cnt1 - cnt0 + 1;
        for ( int i = cnt0; i >= 0; --i ) {
            if(i) s.push_back('0');
            if(i>1) s.push_back('1');
        }
        if ( k ) s = "1" + s, k--;
        if ( k ) s += "1", k--;
        if ( k ) s += "1", k--;
        string ans = "";
        for ( char c : s ) {
            if ( c == '0' && k ) {
                k--;
                ans.push_back('1');
            }
            ans.push_back(c);
        }
        cout << ans << '\n';
    }
    return 0;
}