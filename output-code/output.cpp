#include <bits/stdc++.h>
#define pb      push_back
#define show(x) cout << #x << ": " << x << endl;
using namespace std;
typedef long long ll;
typedef double lf;
typedef complex<lf> pt;
typedef vector<vector<int>> graph;
const int MAX = 200007;
int f (int a) {
	return a + 2;
}
int main( ) {
	int sum = 0;
	int n = 10;
	int sum2 = 0, sum3 = 0, sum4 = 1, sum5 = 0, sum6 = 0;
	int tmp = 0;
	#pragma omp parallel sections
	{
		#pragma omp section
		{
			for (int i = 0; i < 10; ++i) {
		        for (int j = 0; j < 10; ++j) {
		            tmp += j;
		        }
		    }
		}
		#pragma omp section
		{
			#pragma omp parallel for reduction(*:sum4) reduction(+:sum3) reduction(-:sum2) reduction(max:sum6) reduction(min:sum5)
			for (int i = 1; i < n; ++i) {
		        sum2 -= f(i);
		        sum3 += 2 * i + i * i + f(i);
		        sum4 *= i;
		        sum5 = min( sum5 , max(i+i, i*i) ) ;
		        sum6 = ( ( ( ( max( sum6 , i*i*i ) ) ) ) );
		    }
		}
		#pragma omp section
		{
			#pragma omp parallel for reduction(+:sum)
			for (int i = 0; i < n; ++i)
		        sum += i;
		}
	}
	#pragma omp parallel for reduction(+:sum)
	for (int i = 0; i < n; ++i) {
        sum += i;
    }
	cout << sum << ' ' << sum2 << ' ' << sum3 << ' ' << sum4 << ' ' << tmp << endl;
}
