class Solution {
    public String toGoatLatin(String s) {
        String[] a = s.split(" ");
        StringBuilder r = new StringBuilder();
        String v = "aeiouAEIOU";
        for (int i = 0; i < a.length; i++) {
            String w = a[i];
            if (v.indexOf(w.charAt(0)) == -1)
                w = w.substring(1) + w.charAt(0);
            r.append(w).append("ma");
            for (int j = 0; j <= i; j++)
                r.append("a");
            if (i < a.length - 1)
                r.append(" ");
        }
        return r.toString();
    }
}