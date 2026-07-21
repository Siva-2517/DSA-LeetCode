class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int ans = 0;
        int max = 0;
        int prev = Integer.MIN_VALUE;
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int len = j - i;
            if (s.charAt(i) == '1') {
                ans += len;
            } else {
                max = Math.max(max, prev + len);
                prev = len;
            }
            i = j;
        }
        return ans + max;
    }
}