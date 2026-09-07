class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        long x = Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]);
        long y = Math.min(rec1[3], rec2[3]) - Math.max(rec1[1], rec2[1]);

        return x > 0 && y > 0;
    }
}