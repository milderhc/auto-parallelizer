#include <bits/stdc++.h>
#define pb      push_back
#define show(x) cout << #x << ": " << x << endl;
 
using namespace std;

typedef long long ll;
typedef double lf;
typedef complex<lf> pt; 
typedef vector<vector<int>> graph;

const int MAX = 60007;
const double eps = 1e-7;

double x[MAX], v[MAX];
int n;

bool can (double mid) {
    map<pair<double, int>, int> events;
    for (int i = 0; i < n; ++i) {
        ++events[{x[i] - mid * v[i], 0}];
        ++events[{x[i] + mid * v[i], 1}];
    }

    int current = 0;
    for (auto &x : events) {
        if (x.first.second == 0) {
            current += x.second;
            if (current == n) return true;
        } else
            current -= x.second;
    }

    return false;
}

int main( ) {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.setf(ios_base::fixed);
    cout.precision(6);

    cin >> n;
    for (int i = 0; i < n; ++i) cin >> x[i];
    for (int i = 0; i < n; ++i) cin >> v[i];

    double low = 0, high = 1e9 + 10;
    while (abs(low - high) > eps) {
        double mid = (high + low) / 2.0;
        if (can(mid)) high = mid;
        else          low = mid;
    }

    cout << (low + high) / 2.0;
}
