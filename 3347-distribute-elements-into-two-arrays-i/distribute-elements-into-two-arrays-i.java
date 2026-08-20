class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> bl=new ArrayList<>();
        int n=nums.length;
        int a[]=new int[n];
        int b[]=new int[n];
        int res[]=new int[n];
        a[0]=nums[0];
        b[0]=nums[1];
        int l=1,r=1;
        for(int i=2;i<n;i++){
            if(a[l-1]>b[r-1]){
                a[l++]=nums[i];
            }
            else{
                b[r++]=nums[i];
            }
        }
        int s=0;
        for(int i=0;i<l;i++){
            res[s++]=a[i];
        }
        for(int i=0;i<r;i++){
            res[s++]=b[i];
        }
         return res;
    }
}