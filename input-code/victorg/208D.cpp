#include <bits/stdc++.h>

#define		MAX_N	52

using namespace std;

int n;
long long points[ MAX_N ], price[ 5 ], cnt[ 5 ];

void buy( long long &p ){
	long long nItems;
	for( int i = 4; i >= 0; --i ){
		nItems = p / price[ i ];
		cnt[ i ] += nItems;
		p -= nItems * price[ i ];
	}
}

int main(){

	ios_base::sync_with_stdio( 0 );
	cin.tie( 0 );

	cin >> n;
	for( int i = 0; i < n; ++i ) cin >> points[ i ];
	for( int i = 0; i < 5; ++i ) cin >> price[ i ];

	long long ac = 0LL;
	for( int i = 0; i < n; ++i ){
		ac += points[ i ];
		buy( ac );
	}

	for( int i = 0; i < 5; i++ ) cout << cnt[i ] << " ";
	cout << "\n" << ac << "\n";

	return 0;
}