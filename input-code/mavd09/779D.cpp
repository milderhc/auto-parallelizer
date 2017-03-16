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

int n;
string t, p;
int rm[ MAXN ];
int nxt[ MAXN ][ 26 ];

bool can( int x ) {
  int pos = 0;
  for( int i = 0; i < SIZE( p ); i++ ) {
    int c = p[ i ]-'a';
    do {
      if( nxt[ pos ][ c ] == -1 )
        return false;
      pos = nxt[ pos ][ c ];
    } while( rm[ pos ] <= x );
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

  while( cin >> t >> p ) {
    n = SIZE( t );
    for( int i = 1; i <= n; i++ ) {
      int x; cin >> x;
      rm[ x ] = i;
    }
    memset( nxt, -1, sizeof( nxt ) );
    for( int i = n-1; i >= 0; i-- ) {
      for( int j = 0; j < 26; j++ )
        nxt[ i ][ j ] = nxt[ i+1 ][ j ];
      nxt[ i ][ t[ i ]-'a' ] = i+1;
    }
    int lo = 0, hi = n, mi;
    while( lo <= hi ) {
      mi = ( lo+hi )>>1;
      if( can( mi ) )
        lo = mi+1;
      else
        hi = mi-1;
    }
    cout << hi << "\n";
  }

  return 0;
}