class Solution {
    public void dfs(int[][] image,int i,int j,int old,int col)
        {
            if(i<0 || j<0 || i>=image.length || j>=image[0].length ||
             image[i][j]!=old){
                return;
            }
           
            image[i][j]=col;
            dfs(image,i-1,j,old,col);
            dfs(image,i+1,j,old,col);
            dfs(image,i,j+1,old,col);
            dfs(image,i,j-1,old,col);
        }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldC=image[sr][sc];
        if(oldC == color)
            return image;

        dfs(image,sr,sc,oldC,color);
        return image;
    }
}