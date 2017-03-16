#include <bits/stdc++.h>

using namespace std;


const int MAX = int( 1e5 +100 );
const int MOD = int( 1e9+7 );
const int oo  = INT_MAX;

long long dp[ MAX+100 ], acc[ MAX+100 ];
int t, k, a, b;

void precalc() {
  dp[ 0 ] = 1;
  for( int i = 1; i < MAX; i++ ) {
    dp[ i ] = dp[ i-1 ];
    if( i >= k ) dp[ i ] = ( dp[ i ] + dp[ i-k ] ) % MOD;
  }
  acc[ 0 ] = dp [ 0 ];
  for(int i = 1; i < MAX; i++ )
    acc[ i ] = ( acc[ i-1 ] + dp[ i ] )%MOD;
}

int main( ) {

  ios_base::sync_with_stdio( 0 );
  cin.tie( 0 ); cout.tie( 0 );
  cin >> t >> k;
  precalc();
  for(int i = 0; i < t; i++) {
    cin >> a >> b;
    cout << ( (acc[ b ] - acc[ a-1 ] % MOD) + MOD ) % MOD << "\n";
  }
  return 0;
}