class Solution {
    public int[] bfs(ArrayList<ArrayList<Integer>> al,boolean vis[],int src)
    {
        Queue<Integer> q=new LinkedList<>();
        vis[src]=true;
        q.add(src);
        int nodes=0;
        int degree=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            nodes++;
            degree+=al.get(node).size();
            for(int h:al.get(node)){
                if(!vis[h]){
                    vis[h]=true;
                    q.offer(h);
                }
            }
        }
        return new int[]{nodes,degree};
    }
    public int countCompleteComponents(int n,int[][] edges) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        for(int[] y:edges)
        {
            al.get(y[0]).add(y[1]);
            al.get(y[1]).add(y[0]);
        }
        boolean vis[]=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i]){
                int res[]=bfs(al,vis,i);
                if(res[1]==res[0]*(res[0]-1)){
                    c++;
                }
            }
        }
        return c;
    }
}