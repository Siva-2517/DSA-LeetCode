class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[]=new boolean[rooms.size()];
        dfs(rooms,vis,0);
        for(boolean f:vis){
            if(!f){
                return f; 
            }
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms,boolean vis[],int src)
    {
        vis[src]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int y:rooms.get(node)){
                if(!vis[y]){
                    q.add(y);
                    vis[y]=true;
                }
            }
        }
    }
}