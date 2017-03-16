#include <bits/stdc++.h>
#define pb			push_back
using namespace std;

typedef vector<vector<int>> graph;
typedef long long ll;

int get_max (vector<int> &la, vector<int> &ra, vector<int> &lb, vector<int> &rb) {
	int mnr = *min_element(rb.begin(), rb.end());
	int mxl = *max_element(lb.begin(), lb.end());

	// cout << " sadkfj " << mnr << ' ' << mxl <<  endl;

	int ans = 0;
	for (int i = 0; i < la.size(); ++i) {
		ans = max(la[i] - mnr, ans);
		ans = max(mxl - ra[i], ans);
	}
	return ans;
}

int main () {
	ios_base::sync_with_stdio(false);
	cin.tie(0);

	int n;
	cin >> n;
	vector<int> la(n), ra(n);
	for (int i = 0; i < n; ++i) {
		cin >> la[i] >> ra[i];
	}

	int m;
	cin >> m;
	vector<int> lb(m), rb(m);
	for (int i = 0; i < m; ++i) {
		cin >> lb[i] >> rb[i];
	}

	cout << max(get_max(la, ra, lb, rb), get_max(lb, rb, la, ra));
}