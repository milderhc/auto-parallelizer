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
ll a[ MAXN ], b[ MAXN ];

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

  while( cin >> n >> k ) {
    for( int i = 0; i < n; i++ ) cin >> a[ i ];
    for( int i = 0; i < n; i++ ) cin >> b[ i ];
    priority_queue< ll > pq;
    ll ans = 0;
    for( int i = 0; i < n; i++ ) {
      if( a[ i ] <= b[ i ] ) {
        ans += a[ i ];
        k--;
      }
      else {
        pq.push( -( a[ i ]-b[ i ] ) );
        ans += b[ i ];
      }
    }
    while( k > 0 ) {
      ll cur = -pq.top( ); pq.pop( );
      ans += cur; k--;
    }
    cout << ans << "\n";
  }

  return 0;
}