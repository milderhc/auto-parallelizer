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
    for (int i = 0; i < n; ++i)
        sum += i;

    for (int i = 0; i < n; ++i) {
        sum += i;
    }

    int sum2 = 0, sum3 = 0, sum4 = 0;
    for (int i = 0; i < n; ++i) {
        sum += i;
        sum2 = sum2 + f(a);
        sum3 += 2 * i + i * i + f(a);
        sum4 *= i;
    }
}