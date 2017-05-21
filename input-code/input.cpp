#include<bits/stdc++.h>

using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef pair<int, ii> iii;

const int MAX = 60006;
const double EPS = 1e-6;
const int INF = INT_MAX;

double v[MAX], x[MAX];
int n;

int function (int a) {
    return 10;
}

double get_t(double p) {
	int a = 10;
	function(a);
	int b = 20;
	function(b);
	return ret;
}
int main( ) {
     ios_base::sync_with_stdio(0);
//     cin.tie(0);

    cin >> n;
    double low  = INT_MAX, high = -1;
    for(int i = 0; i < n; i++) {
        cin >> x[i];
        low = min(low, x[i]);
        high = max(high, x[i]);
    }

    for(int i = 0; i < n; i++) {
        cin >> v[i];
    }
//    for(int i = 0; i < 10; i++) {
//        cout << i << " -> " << get_t(i) << endl;
//    }
    while(abs(low-high) > EPS) {
        double mid1 = low + (high-low)/3;
        double mid2 = high - (high-low)/3;
        double f1 = get_t(mid1);
        double f2 = get_t(mid2);
//        cout << low << " " << high << endl;
//        cout << mid1 << " " << mid2 << endl;
//        cout << f1 << " " << f2 << endl;
//        system("pause");
        if(f1 < f2) high = mid2;
        else low = mid1;
    }

    cout << fixed << setprecision(10) << get_t((low+high)/2.0) << "\n";

}