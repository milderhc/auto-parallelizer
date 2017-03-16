#include <bits/stdc++.h>

using namespace std;

int n, m, sz;
int a[ 18 ][ 1 << 17 ];

void initMatrix(  ){
	for( int i = 0; i < n; ++i )
		for( int j = 0; j < (sz >> i); j += 2 )
			a[ i + 1 ][ j/2 ] = (i & 1) ? (a[ i ][ j ] ^ a[ i ][ j+1 ]) : (a[ i ][ j ] | a[ i ][ j+1 ]);
}

int getV( int i, int j ){
	if( i == n ) return a[ n ][ 0 ];
	int adj = (j & 1) ? -1 : 1;
	a[ i + 1 ][ j/2 ] = (i & 1) ? (a[ i ][ j ] ^ a[ i ][ j+adj ]) : (a[ i ][ j ] | a[ i ][ j+adj ]);
	return getV( i+1, j/2 );
}

int main(){

	ios_base::sync_with_stdio( 0 );
	cin.tie( 0 );

	//freopen( "/home/vg/Programacion/input", "r", stdin );

	cin >> n >> m;
	sz = (1 << n);
	for( int i = 0; i < sz; ++i ) cin >> a[ 0 ][ i ];

	initMatrix();

	int idx, val, prv;
	while( m-- ){
		cin >> idx >> val; idx--;
		a[ 0 ][ idx ] = val;
		cout << getV( 0, idx ) << "\n";
	}

	return 0;
}