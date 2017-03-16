#include <bits/stdc++.h>

using namespace std;

const int MAX_N = 1e5 + 10;
int t, k, mod = (1e9) + 7;
int dp[ MAX_N ], ac[ MAX_N ];

int main(){

	ios_base::sync_with_stdio( 0 );
	cin.tie( 0 );

	//freopen( "/home/vg/Programacion/input", "r", stdin );

	cin >> t >> k;
	int a, b;

	dp[ 0 ] = 1;
	for( int i = 1; i <= 100000; i++ ){
		dp[ i ] = dp[ i-1 ];
		if( i - k >= 0 ) dp[ i ] = (dp[ i ] + dp[i-k]) % mod;
		ac[ i ] = (ac[ i-1 ] + dp[i]) % mod;
	}

	while( t-- ){
		cin >> a >> b;
		cout << ((ac[b] - ac[ a - 1 ]) + mod) % mod << "\n";
	}

	return 0;
}