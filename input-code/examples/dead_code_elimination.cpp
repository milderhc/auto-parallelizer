#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

const int MAXN = 1024;
const int MOD = int(1e9)+7;
int n;
int c[ MAXN ];
int d[ MAXN ];

int add( int a, int b ) {
  int r = a+b;
  if( r >= MOD ) return r-MOD;
  return r;
}

int sub( int a, int b ) {
  int r = a-b;
  if( r < 0 ) return r+MOD;
  return r;
}

int mult( int a, int b ) {
  int r = a*b;
  while( r >= MOD ) r -= MOD;
  return r;
}

ll mod_mul( ll a, ll b, ll mod ) {
  ll x = 0, y = a%mod;
  while( b ) {
    if( b&1 ) {
      x = ( x+y )%mod;
    }
    y = ( y+y )%mod;
    b >>= 1;
  }
  return x;
}

ll mod_pow( ll b, ll e, ll mod ) {
  ll r = 1;
  while( e > 0 ) {
    if( e&1 ) {
      r = mod_mul( r, b, mod );
    }
    b = mod_mul( b, b, mod );
    e >>= 1;
  }
  return r;
}

int main() {
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  cin >> n;
  for( int i = 1; i <= n; ++i)
    cin >> c[i];
  for( int i = 1; i <= n; ++i ) {
    d[ i ] = add( d[ i-1 ], d[ i-1 ] );
    d[ i ] = add( d[ i ], 2 );
    d[ i ] = sub( d[ i ], d[ c[i]-1 ] );
  }
  cout << d[ n ] << '\n';
}