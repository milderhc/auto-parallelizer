#include <bits/stdc++.h>

using namespace std;

typedef vector<vector<int>> graph;

int main( ) {

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