#include <bits/stdc++.h>
#define pb			push_back
using namespace std;

typedef vector<vector<int>> graph;
typedef long long ll;

ll n, m;
inline ll gauss (ll x) {
	return x * (x + 1LL) / 2LL;
}

ll go (ll x) {
	return n - gauss(x);
}

int main () {
	ios_base::sync_with_stdio(false);
	cin.tie(0);

	cin >> n >> m;
	if (m >= n) {
		cout << n;
		return 0;
	}
	n -= m;

	ll low = 0, high = 2e9 + 50;
	while (low <= high) {
		ll mid = (low + high) / 2;
		if (go(mid) <= 0)  high = mid - 1;
		else		       low = mid + 1;
	}

	cout << m + low;
}