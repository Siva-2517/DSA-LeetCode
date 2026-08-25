class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int r=k;
        while (true) {
            if (!set.contains(r)) {
                break;
            }
            r += k;
        }
        return r;
    }
}