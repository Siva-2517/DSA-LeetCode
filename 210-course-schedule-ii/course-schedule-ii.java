class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        int[] in = new int[numCourses];

        for(int[] p: pre){
            graph.get(p[1]).add(p[0]);
            in[p[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(in[i]==0){
                q.add(i);
            }
        }

        int[] ans = new int[numCourses];
        int i = 0;

        while(!q.isEmpty()){
            int node = q.poll();
            ans[i++] = node;

            for(int nei: graph.get(node)){
                in[nei]--;

                if(in[nei]==0){
                    q.add(nei);
                }
            }
        }

        if(i != numCourses){
            return new int[0];
        }

        return ans;
    }
}