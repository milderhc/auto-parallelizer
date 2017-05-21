#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<int, int> ii;
typedef pair<int, ii> iii;
const int MAX = 60006;
const double EPS = 1e-6;
const int INF = INT_MAX;
double v[MAX], x[MAX];
int n;
int function (int c) {
	return 10;
}
int main( ) {
	vector<int> a(10);
	vector<int> b(10);
	#pragma omp parallel sections
	{
		#pragma omp section
		{
			for (int i = 0; i < 10; ++i)
        b[i] = function(i);
		}
		#pragma omp section
		{
			for (int i = 0; i < 10; ++i)
        a[i] = i;
		}
	}
}
