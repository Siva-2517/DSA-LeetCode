class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int a[][] = new int[m][n];
        int c = 0;
        for (int[] y : indices) {
            int x=y[0];
            int z=y[1];
            for (int i = 0; i < n; i++) {
                a[x][i]++;
            }
            for (int i = 0; i < m; i++) {
                a[i][z]++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]%2!=0) c++;
            }
        }
        return c;
    }
}