//http://codeforces.com/contest/555/problem/E
#include <bits/stdc++.h>

#define		MAX_N	200010

using namespace std;

int n, m, q, t, typeCnt, low[MAX_N], dfn[MAX_N], father[MAX_N], depth[MAX_N], type[MAX_N], sparse[MAX_N][20];
int cntS[MAX_N], cntD[MAX_N], cntLCA[MAX_N];
vector<int> graph[MAX_N], tree[MAX_N];
stack<int> s;

void tarjan( int u, int f ){
	//cout << "ini:" << u << endl;
	dfn[u] = low[u] = ++t;
	s.push( u );
	int cntF = 0;
	for( int i = 0, v; i < graph[u].size(); i++ ){
		v = graph[u][i];
		if( v == f ) cntF++;
		if( !dfn[v] ){
			tarjan( v, u );
			low[u] = min( low[u], low[v] );
			if( low[v] > dfn[u] ){
				//cout << "Puente en " << u << "-" << v << endl;
				int w;
				typeCnt++;
				do{
					w = s.top(); s.pop();
					type[w] = typeCnt;
				}while( w != v );
			}
		}
		else if( v != f || cntF > 1 ){
			//if( v == f ) cout << "shi\n";
			low[u] = min( low[u], dfn[v] );
		}
	}
	//cout << "fin:" << u << endl;
}

void dfs( int u, int d ){
	dfn[u] = ++t;
	for( int i = 0, v; i < graph[u].size(); i++ ){
		v = graph[u][i];
		if( !dfn[v] ){
			if( type[u] != type[v] ){
				father[ type[v] ] = type[u];
				tree[ type[u] ].push_back( type[v] );
				depth[ type[v] ] = d + 1;
				dfs( v, d + 1 );
			}
			else dfs( v, d );
		}
	}
}

bool checkTree( int u ){
	dfn[u] = ++t;
	for( int i = 0, v; i < tree[u].size(); i++ ){
		v = tree[u][i];
		if( !checkTree( v ) ) return false;
	}
	if( cntS[u] > cntLCA[u] && cntD[u] > cntLCA[u] ) return false;
	cntS[ father[u] ] += cntS[ u ];
	cntD[ father[u] ] += cntD[ u ];
	cntLCA[ father[u] ] += cntLCA[ u ];
	return true;
}

void sparseTable(  ){
	for( int i = 1; i <= typeCnt; i++ ) sparse[i][0] = father[i];
	for( int j = 1; j < 20; j++ ){
		for( int i = 1; i <= typeCnt; i++ ){
			sparse[i][j] = sparse[ sparse[i][j-1] ][j-1];
		}
	}
}

int get_lca( int u, int v ){
	if( sparse[u][19] != sparse[v][19] ) return -1;
	if( depth[u] < depth[v] ) swap( u, v );
	for( int i = 19; i >= 0 && depth[u] > depth[v]; i-- ){
		if( depth[ sparse[u][i] ] >= depth[v] ) u = sparse[u][i];
	}
	if( u == v ) return u;
	for( int i = 19; i >= 0; i-- ){
		if( sparse[u][i] != sparse[v][i] ){
			u = sparse[u][i];
			v = sparse[v][i];
		}
	}
	return father[u];
}

int main(){

	ios_base::sync_with_stdio( 0 );
	cin.tie( 0 );

	cin >> n >> m >> q;

	for( int i = 0, u, v; i < m; i++ ){
		cin >> u >> v;
		graph[u].push_back(v);
		graph[v].push_back(u);
	}

	///cout << "->" << 1 << endl;

	for( int i = 1; i <= n; i++ ){
		if( !dfn[i] ){
			tarjan( i, -1 );
			int w;
			typeCnt++;
			do{
				w = s.top(); s.pop();
				type[w] = typeCnt;
			}while( !s.empty() );
		}
	}

	for( int i = 1; i <= n; i++ ) dfn[i] = 0;
	t = 0;

	///cout << "->" << 2 << endl;

	for( int i = 1; i <= n; i++ ){
		if( !dfn[i] ){
			dfs( i, 0 );
			father[ type[i] ] = type[i];
		}
	}

	/*for( int i = 1; i <= n; i++ ){
		cout << i << " type ->" << type[i]  << endl;
	}*/

	///cout << "->" << 3 << endl;
	sparseTable();

	///cout << "->" << 4 << endl;
	bool ans = true;
	int s, d, lca;
	while( q-- ){
		cin >> s >> d;
		if( ans ){
			cntS[ type[s] ]++;
			cntD[ type[d] ]++;
			lca = get_lca( type[s], type[d] );
			if( lca == -1 ) ans = false;
			else{
				cntLCA[ lca ]++;
			}
		}
	}

	/*for( int i = 1; i <= typeCnt; i++ ){
		cout << i << " conectado a: \n";
		for( int j = 0; j < tree[i].size(); j++ ){
			cout << tree[i][j] << " ";
		}
		cout << endl;
	}*/

	/*for(int i = 0; i < 10; i++) cout << father[i] << " ";
	cout << endl;*/
	///cout << "->" << 5 << endl;
	for( int i = 1; i <= typeCnt && ans; i++ ){
		if( father[i] == i ){
			ans = checkTree( i );
		}
	}

	cout << ((ans) ? "Yes\n" : "No\n");

	return 0;
}