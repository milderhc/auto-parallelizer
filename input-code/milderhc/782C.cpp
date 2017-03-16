#include <bits/stdc++.h>
#define pb      push_back
#define show(x) cout << #x << ": " << x << endl;
 
using namespace std;

typedef long long ll;
typedef double lf;
typedef complex<lf> pt; 
typedef vector<vector<int>> graph;

const int MAX = 200007;

int main( ) {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n, u, v;
    cin >> n;

    graph g(n + 1);
    for (int i = 1; i < n; ++i) {
        cin >> u >> v;
        g[u].pb(v);
        g[v].pb(u);
    }

    vector<int> color(n + 1);
    vector<int> parent(n + 1);
    queue<int> q;
    q.push(1);
    color[1] = 1;
    parent[1] = -1;

    int ans = 0;
    while (q.size()) {
        int u = q.front(); q.pop();
        int p = parent[u];
        set<int> used;
        used.insert(color[u]);
        used.insert(p == -1 ? 0 : color[p]);

        int current = 1;
        for (auto &v : g[u]) {
            if (!color[v]) {
                while (used.count(current)) ++current;
                color[v] = current;
                parent[v] = u;
                q.push(v);
                used.insert(current);
                ans = max(ans, current);
            }
        }
    }

    cout << ans << '\n';
    for (int i = 1; i <= n; ++i)
        cout << color[i] << ' ';
}