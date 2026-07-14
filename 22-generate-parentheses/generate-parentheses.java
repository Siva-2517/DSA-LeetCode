class Solution {
    public void dfs(String s,int o,int c,int n,List<String> ans)
    {
        if(s.length()==2*n)
        {
            ans.add(s);
        }

        if(o<n){
            dfs(s+"(",o+1,c,n,ans);
        }
        if(c<o){
            dfs(s+")",o,c+1,n,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();

        dfs("",0,0,n,ans);
        return ans;
    }
}