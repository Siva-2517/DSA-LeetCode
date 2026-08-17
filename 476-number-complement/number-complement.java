class Solution {
    public int findComplement(int num) {
        int b=32-Integer.numberOfLeadingZeros(num);
        int m=(1<<b)-1;
        return num^m;
    }
}

