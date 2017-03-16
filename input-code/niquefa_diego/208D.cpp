#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
const int N = 5;

ll ans[N], price[N];
ll funds = 0, amnt;

void buyStuff() {
    for ( int i = N-1; i >= 0; --i ) {
        amnt = funds / price[i];
        funds -= amnt * price[i];
        ans[i] += amnt;
    }
}

int main () {
    int n;
    cin >> n;
    vector<ll> points ( n );
    for ( int i = 0; i < n; ++i ) cin >> points[i];
    for ( int i = 0; i < N; ++i ) cin >> price[i];
    for ( ll p : points ) {
        funds += p;
        buyStuff();
    }
    for ( int i = 0; i < N; ++i )
        cout << ans[i] << " \n"[i+1==N];
    cout << funds << '\n';
    return 0;
}