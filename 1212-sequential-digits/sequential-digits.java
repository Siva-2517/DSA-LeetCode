class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String d = "123456789";
        int l=String.valueOf(low).length(),h=String.valueOf(high).length();
        for (int len = l; len <= h; len++) {
            for (int j = 0; j + len <= 9; j++) {
                int num = Integer.parseInt(d.substring(j, j + len));
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}