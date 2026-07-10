class Solution {
    public int orangesRotting(int[][] grid) {
        int f=0,m=0;
        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1) f++;
                else if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }

        if(f==0) return 0;
        if (q.isEmpty()) return -1;
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty() && f>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
            int cur[]=q.poll();
            int r=cur[0];
            int c=cur[1];

            for(int[] d:dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if (nr >= 0 && nc >= 0 &&
                        nr < row && nc < col &&
                            grid[nr][nc] == 1) {
                             grid[nr][nc] = 2;

                        f--;
                        q.add(new int[]{nr, nc});

                }
            }
        }
        m++;
        }
        return f == 0 ? m: -1;
    }
}
