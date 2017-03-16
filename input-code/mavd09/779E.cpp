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

const int MAXN = int( 6e3 );
const int MOD  = int( 360 );
const int oo   = INT_MAX;

int n, m;
int a[ MAXN ], tp[ MAXN ], b[ MAXN ];
string c[ MAXN ];
map< string, int > var;
int cnt[ 2 ][ 2 ], val[ MAXN ];

int doit( int i, int j, int v ) {
  if( tp[ j ] == 3 )
    return c[ j ][ i ]-'0';
  int x, y;

  if( a[ j ] == -1 ) x = v;
  else x = val[ a[ j ] ];

  if( b[ j ] == -1 ) y = v;
  else y = val[ b[ j ] ];

  if( tp[ j ] == 0 )
    return x&y;
  if( tp[ j ] == 1 )
    return x|y;
  if( tp[ j ] == 2 )
    return x^y;

  assert( false );
  return -1;
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

  cin >> n >> m; cin.ignore( );
  string line;
  for( int i = 0; i < n; i++ ) {
    getline( cin, line );
    stringstream ss( line );
    vector< string > token;
    while( ss >> line )
      token.PB( line );
    if( SIZE( token ) == 3 ) {
      c[ i ] = token[ 2 ];
      tp[ i ] = 3;
    }
    else {
      if( token[ 2 ] == "?" ) a[ i ] = -1;
      else                    a[ i ] = var[ token[ 2 ] ];

      if( token[ 3 ] == "AND" ) tp[ i ] = 0;
      if( token[ 3 ] == "OR" )  tp[ i ] = 1;
      if( token[ 3 ] == "XOR" ) tp[ i ] = 2;

      if( token[ 4 ] == "?" ) b[ i ] = -1;
      else                    b[ i ] = var[ token[ 4 ] ];
    }
    var[ token[ 0 ] ] = i;
  }

  string mn = "", mx = "";
  for( int i = 0; i < m; i++ ) {
    memset( cnt, 0, sizeof( cnt ) );
    for( int k = 0; k < 2; k++ ) {
      for( int j = 0; j < n; j++ ) {
        val[ j ] = doit( i, j, k );
        cnt[ k ][ val[ j ] ]++;
      }
    }
    if( cnt[ 0 ][ 1 ] < cnt[ 1 ][ 1 ] ) {
      mn.PB( '0' ); mx.PB( '1' );
    }
    else if( cnt[ 0 ][ 1 ] > cnt[ 1 ][ 1 ] ) {
      mn.PB( '1' ); mx.PB( '0' );
    }
    else {
      mn.PB( '0' ); mx.PB( '0' );
    }
  }
  cout << mn << "\n" << mx << "\n";

  return 0;
}