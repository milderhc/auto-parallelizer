#include <bits/stdc++.h>

#define		MAX_N		100010
#define		MAX_M		100010
#define		MAX_K		1000010

using namespace std;

typedef pair<int, int> pii;
typedef pair<pii, int> query;

int n, m, k, sqr, cur_l, cur_r;
long long cur_v;
vector< query > queries;
int a[ MAX_N ], cnt[ 1 << 20 ];
long long ans[ MAX_M ];

bool cmp( query f, query s ){
	if( f.first.first / sqr != s.first.first / sqr )
		return f.first < s.first;
	return f.first.second < s.first.second;
}

query make_query( int l, int r, int i ){
	return make_pair( make_pair( l, r ), i );
}

long long solve( pii q ){
	int l = q.first;
	int r = q.second;
	
	while( cur_l > l ){
		--cur_l;
		cur_v += cnt[ a[ cur_l-1 ] ^ k ];
		cnt[ a[ cur_l-1 ] ]++;
	}

	while( cur_r < r ){
		++cur_r;
		cur_v += cnt[ a[ cur_r ] ^ k ];
		cnt[ a[ cur_r ] ]++;
	}

	while( cur_l < l ){
		cnt[ a[ cur_l-1 ] ]--;
		cur_v -= cnt[ a[ cur_l-1 ] ^ k ];
		++cur_l;
	}

	while( cur_r > r ){
		cnt[ a[ cur_r ] ]--;
		cur_v -= cnt[ a[ cur_r ] ^ k ];
		--cur_r;	
	}
	
	return cur_v;
}

int main(){

	ios_base::sync_with_stdio( 0 );
	cin.tie( 0 );

	//freopen( "/home/vg/Programacion/input", "r", stdin );

	cin >> n >> m >> k;
	sqr = sqrt( n );

	for( int i = 1; i <= n; i++ ){
		cin >> a[i];
		a[i] ^= a[i-1];
	}

	for( int i = 0, l, r; i < m; i++ ){
		cin >> l >> r;
		queries.push_back( make_query(l, r, i) );
	}

	sort( queries.begin(), queries.end(), cmp );

	cur_r = 0;
	cur_l = cnt[0] = 1;
	for( int i = 0; i < m; i++ ){
		ans[ queries[i].second ] = solve( queries[i].first );	
	}

	for( int i = 0;i < m; i++ ){
		cout << ans[i] << endl;
	}

}