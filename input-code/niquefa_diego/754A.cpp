#include <bits/stdc++.h>
using namespace std;

int main () {
    int n;
    cin >> n;
    vector<int> a ( n );
    for ( int i = 0; i < n; ++i )
        cin >> a[i];

    int sum = 0;
    for ( int i = 0; i < n; ++i )
        sum += a[i];

    if ( sum != 0 ) {
        cout << "YES\n";
        cout << "1\n";
        cout << 1 << " " << n << "\n";
        return 0;
    }

    int sumA = 0;
    for ( int i = 0; i+1 < n; ++i ) {
        sumA += a[i];
        if ( sumA != 0 && sum - sumA != 0 ) {
            cout << "YES\n";
            cout << "2\n";
            cout << 1 << " " << i+1 << endl;
            cout << i+2 << " " << n << endl;
            return 0;
        }
    }

    cout << "NO\n";
    return 0;
}
