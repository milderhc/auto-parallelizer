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
int f1 () {
	vector<int> a(10);
	for (int i = 0; i < 10; ++i)
        a[i] = i;
}
int xd (int a) {
	return a + 2;
}
int f2() {
	vector<int> b(10);
	for (int i = 0; i < 10; ++i)
        b[i] = xd(i);
}
int main( ) {
	#pragma omp parallel sections
	{
		#pragma omp section
		{
			f2();
		}
		#pragma omp section
		{
			f1();
		}
	}
}
