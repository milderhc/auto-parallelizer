#include <bits/stdc++.h>
#define pb			push_back
using namespace std;

typedef vector<vector<int>> graph;
typedef long long ll;

int main () {
	ios_base::sync_with_stdio(false);
	cin.tie(0);

	map<string, int> mp;

	mp["Tetrahedron"] = 4;
	mp["Cube"] = 6;
	mp["Octahedron"] = 8;
	mp["Dodecahedron"] = 12;
	mp["Icosahedron"] = 20;

	int n;
	cin >> n;
	int ans = 0;
	string s;
	while (n--) {
		cin >> s;
		ans += mp[s];
	}
	cout << ans;
}