#include <bits/stdc++.h>

using namespace std;

typedef vector<vector<int>> graph;

const int MAX_N = int( 1e5 );

double board[ MAX_N ][ MAX_N ];
int arr[ MAX_N ];

void init() {
    for( int i = 0; i < MAX_N; ++i )
        for( int j = 0; j < MAX_N; j++ )
            board[ i ][ j ] = i*j;

    for( int i = 1; i < MAX_N; ++i )
        arr[ i ] = arr[ i-1 ] ^ i;
}

int main( ) {
    init();

    graph A( 10 );
    for( int i = 0, current = 0; i < A.size(); ++i ) {
    	for( int j = 0; j < 20; ++j, ++current )
    		A[ i ].push_back( current );
    }

    int B[100];
    for( int i = 0; i < 100; ++i ) {
    	B[ i ] = i*i;
    }

}
