class Solution {
    public int minCostConnectPoints(int[][] p) {
        int n = p.length;
        boolean[] vis = new boolean[n];
        int[] dis = new int[n];

        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[0] = 0;

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int u = -1;

            for (int j = 0; j < n; j++) {
                if (!vis[j] && (u == -1 || dis[j] < dis[u])) {
                    u = j;
                }
            }

            vis[u] = true;
            ans += dis[u];

            for (int v = 0; v < n; v++) {
                if (!vis[v]) {
                    int d = Math.abs(p[u][0] - p[v][0]) + Math.abs(p[u][1] - p[v][1]);
                    dis[v] = Math.min(dis[v], d);
                }
            }
        }

        return ans;
    }
}