class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int a[][] = new int[m][n];
        int c = 0;
        for (int[] y : indices) {
            for (int i = 0; i < n; i++) {
                a[y[0]][i]++;
                if (a[y[0]][i] % 2 == 1)
                    c++;
                else
                    c--;
            }
            for (int i = 0; i < m; i++) {
                a[i][y[1]]++;
                if (a[i][y[1]] % 2 == 1)
                    c++;
                else
                    c--;
            }
        }
        return c;
    }
}