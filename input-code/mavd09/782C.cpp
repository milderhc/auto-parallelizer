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

const int MAXN = int( 3e5 );
const int MOD  = int( 360 );
const int oo   = INT_MAX;

int n, k;
vi graph[ MAXN ];
int color[ MAXN ];

void init( ) {
  for( int i = 0; i < MAXN; i++ )
    graph[ i ].clear( );
}

void dfs( int u, int p ) {
  int cur = 1;
  for( auto& v : graph[ u ] ) {
    if( v == p ) continue;
    while( cur == color[ u ] || cur == color[ p ] ) cur++;
    color[ v ] = cur;
    k = max( k, cur );
    dfs( v, u );
    cur++;
  }
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

  while( cin >> n ) {
    init( );
    for( int i = 1; i < n; i++ ) {
      int u, v; cin >> u >> v; u--; v--;
      graph[ u ].PB( v );
      graph[ v ].PB( u );
    }
    k = 0;
    color[ 0 ] = ++k;
    for( auto& v : graph[ 0 ] )
      color[ v ] = ++k;
    for( auto& u : graph[ 0 ] ) {
      dfs( u, 0 );
    }
    cout << k << "\n";
    for( int i = 0; i < n; i++ ) {
      cout << color[ i ] << " ";
    }
    cout << "\n";
  }

  return 0;
}