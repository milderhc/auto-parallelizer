#include <bits/stdc++.h>

#define PB          push_back
#define PF          push_front
#define MP          make_pair
#define FI          first
#define SE          second
#define SIZE( A )   int( ( A ).size( ) )
#define ALL( A )    ( A ).begin( ), ( A ).end( )
#define ALLR( A )   ( A ).rbegin( ), ( A ).rend( )

using namespace std;

typedef long long           ll;
typedef unsigned long long  ull;
typedef long double         lf;
typedef pair< int, int >    pii;
typedef pair< ll, ll >      pll;
typedef vector< bool >      vb;
typedef vector< lf >        vd;
typedef vector< ll >        vll;
typedef vector< int >       vi;
typedef vector< pii >       vpii;

typedef complex< lf >       pt;

const int MAXN = int( 1e5 );
const int MOD  = int( 360 );
const lf  oo   = lf( 1e18 );

int n;
pair< lf, lf > x[ MAXN ];

bool can( lf t ) {
  lf d = oo;
  for( int i = 0; i < n; i++ )
    d = min( d, x[ i ].FI + x[ i ].SE*t );
  for( int i = 0; i < n; i++ ) {
    if( x[ i ].FI <= d ) {
      lf cur = x[ i ].FI + x[ i ].SE*t;
      if( cur < d ) return false;
    }
    else {
      lf cur = x[ i ].FI - x[ i ].SE*t;
      if( cur > d ) return false;
    }
  }
  return true;
}

int main( ) {

  #ifdef LOCAL
    freopen( "input", "r", stdin );
    //freopen( "output", "w", stdout );
  #else
    //freopen( "input", "r", stdin );
    //freopen( "output", "w", stdout );
    ios_base::sync_with_stdio( 0 );
    cin.tie( 0 );
  #endif

  cout << fixed << setprecision( 10 );

  while( cin >> n ) {
    for( int i = 0; i < n; i++ ) cin >> x[ i ].FI;
    for( int i = 0; i < n; i++ ) cin >> x[ i ].SE;
    sort( x, x+n );
    lf lo = 0.0, hi = 1e15, mi;
    for( int it = 0; it < 1000; it++ ) {
      mi = ( lo+hi )/2.0;
      if( !can( mi ) ) lo = mi;
      else hi = mi;
    }
    cout << (lo+hi)/2.0 << "\n";
  }

  return 0;
}