class Solution {
    public void sortColors(int[] nums) {
        int l=0,mid=0;
        int h=nums.length-1;
        while(mid<=h){
            if(nums[mid]==0){
                int t=nums[l];
                nums[l]=nums[mid];
                nums[mid]=t;
                l++;mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int t=nums[h];
                nums[h]=nums[mid];
                nums[mid]=t;
                h--;
            }
        }
    }
}