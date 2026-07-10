class Solution {
    public boolean bfs(ArrayList<ArrayList<Integer>> al,int src,int des,int n)
    {
        boolean vis[]=new boolean[n];
        vis[src]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);

        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int x:al.get(node))
            {
                if(!vis[x]){
                    q.offer(x);
                    vis[x]=true;
                }
                if(x==des) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int src, int des) {
        if(src==des) return true;
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        for(int[] h:edges)
        {
            al.get(h[0]).add(h[1]);
            al.get(h[1]).add(h[0]);
        }
        return bfs(al,src,des,n);
    }
}