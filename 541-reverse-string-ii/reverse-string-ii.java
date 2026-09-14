class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        int n = a.length;
        for (int i = 0; i < n; i += 2 * k) {
            int l = i;
            int r = Math.min(i + k - 1, n - 1);
            while (l < r) {
                char t = a[l];
                a[l] = a[r];
                a[r] = t;
                l++;
                r--;
            }
        }
        return new String(a);
    }
}