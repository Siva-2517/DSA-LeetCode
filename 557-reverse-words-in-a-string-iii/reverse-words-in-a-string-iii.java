class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        for(String t:s.split(" ")){
            sb.append(new StringBuilder(t).reverse()).append(" ");
        }
        return sb.toString().trim();
    }
}