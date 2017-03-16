#include <bits/stdc++.h>

#define PB          push_back
#define PF          push_front
#define MP          make_pair
#define FI          first
#define SE          second

#define x(P)        real(P)
#define y(P)        imag(P)
#define cross(A,B)  y(conj(A)*(B))
#define dot(A,B)    x(conj(A)*(B))

using namespace std;

typedef long long           ll;
typedef vector< bool >      vb;
typedef vector< ll >        vll;
typedef vector< int >       vi;
typedef vector< vi >        vvi;
typedef vector< vvi >       vvvi;

const int MAX = int( 1e7 );
const int MOD = int( 1e9+7 );
const int oo  = INT_MAX;

struct SAT {
  int n;
  vvvi graph;
  vi tag;
  vb seen, value;
  stack< int > st;
  SAT( int n ) : n( n ), graph( 2, vvi( 2*n ) ), tag( 2*n ), seen( 2*n ), value( 2*n ) { }
  int neg( int x ) {
    return 2*n-x-1;
  }
  ///We give u V v and it makes ¬u -> v and ¬v -> u
  void make_implication( int u, int v ) {
    implication( neg(u), v );
    implication( neg(v), u );
  }
  void make_true( int u ) {
    add_edge( neg(u), u );
  }
  void make_false( int u ) {
    make_true( neg(u) );
  }
  void eq( int u, int v ) {
    implication( u, v );
    implication( v, u );
  }
  void diff( int u, int v ) {
    eq( u, neg(v) );
  }
  void implication( int u, int v ) {
    add_edge( u, v );
    add_edge( neg(v), neg(u) );
  }
  void add_edge( int u, int v ) {
    graph[ 0 ][ u ].push_back( v );
    graph[ 1 ][ v ].push_back( u );
  }
  void dfs( int id, int u, int t = 0 ) {
    seen[ u ] = true;
    for( auto& v : graph[ id ][ u ] )
      if( !seen[ v ] )
        dfs( id, v, t );
    if( id == 0 )
      st.push( u );
    else
      tag[ u ] = t;
  }
  void kosaraju( ) {
    for( int u = 0; u < n; u++ ) {
      if( !seen[ u ] )
        dfs( 0, u );
      if( !seen[ neg(u) ] )
        dfs( 0, neg(u) );
    }
    fill( seen.begin( ), seen.end( ), false );
    int t = 0;
    while( !st.empty( ) ) {
      int u = st.top( ); st.pop( );
      if( !seen[ u ] )
        dfs( 1, u, t++ );
    }
  }
  bool satisfiable( ) {
    kosaraju();
    for( int i = 0; i < n; i++ ) {
      if( tag[ i ] == tag[ neg(i) ] ) return false;
      value[ i ] = tag[ i ] > tag[ neg(i) ];
    }
    return true;
  }
};

int main( ) {

  ios_base::sync_with_stdio( 0 );
  cin.tie( 0 ); cout.tie( 0 );
  int n; cin >> n;
  SAT s( n );
  string p[n],q[n];
  for(int i = 0; i < n; i++) {
      cin >> p[i] >> q[i];
      p[i] = p[i].substr(0,3);
      q[i] = p[i].substr(0,2) + q[i][0];
  }
  for(int i = 0; i < n; i++) {
    for(int j = i+1; j < n; j++) {
      if( p[i] == p[j] ) {
        s.make_false( i );
        s.make_false( j );
      }
      if( q[i] == q[j] ) s.make_implication( i, j );
      if( p[i] == q[j] ) s.make_implication( s.neg(i), j );
      if( q[i] == p[j] ) s.make_implication( s.neg(j), i );
    }
  }
  if( !s.satisfiable() ) cout << "NO\n";
  else {
      cout << "YES\n";
      for(int i = 0; i < n; i++) {
        if( s.value[i] ) cout << p[i] << "\n";
        else cout << q[i] << "\n";
      }
  }
  return 0;
}