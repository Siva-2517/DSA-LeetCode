class Solution {
    public int maxRepeating(String seq, String word) {
        int n=seq.length();
        int m=word.length();
        int dp[]=new int[n];
        int ans=0;
        for(int i=m-1;i<n;i++)
        {
            if(seq.substring(i-m+1,i+1).equals(word)){
                dp[i]=1;
                if(i>=m){
                    dp[i]+=dp[i-m];
                }
                ans = Math.max(ans, dp[i]);
            }
        }
        return ans;
    }
}