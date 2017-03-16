#include <bits/stdc++.h>

using namespace std;

typedef long long           ll;

const int MAX = int( 1e7 );
const int MOD = int( 1e9+7 );
const int oo  = INT_MAX;

ll p[ 5 ], c[ 123 ], ans[ 5 ];
ll n, cur;

int main( ) {
  ios_base::sync_with_stdio( 0 );
  cin.tie( 0 ); cout.tie( 0 );
  cin >> n;
  for(int i = 0; i < n; i++) cin >> c[ i ];
  for(int i = 0; i < 5; i++) cin >> p[ i ];
  cur = 0LL;
  for(int i = 0; i < n; i++) {
    cur += c [ i ];
    for(int j = 4; j >= 0; j--) {
      if( p[ j ] <= cur ) {
        ans[ j ] += cur / p[ j ];
        cur %= p[ j ];
      }
    }
  }
  cout << ans[ 0 ];
  for(int i = 1; i < 5; i++) {
    cout << " " << ans[ i ];
  }
  cout << "\n" << cur << "\n";
  return 0;
}