class Solution {
    public boolean uniformArray(int[] nums1) {
        int c=0;
        int min=Integer.MAX_VALUE;
        for(int y:nums1){
            min=Math.min(y,min);
            if(y%2==1){
                c++;
            }
        }
        return c==0 || min%2==1; 
    }
}