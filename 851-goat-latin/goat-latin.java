class Solution {
    public String toGoatLatin(String s) {
        String[] a = s.split(" ");
        String r = "";
        String v = "aeiouAEIOU";
        for (int i = 0; i < a.length; i++) {
            String w = a[i];
            if (v.indexOf(w.charAt(0)) == -1)
                w = w.substring(1) + w.charAt(0);
            w += "ma";
            for (int j = 0; j <= i; j++)
                w += "a";
            if (i > 0)
                r += " ";
            r += w;
        }
        return r;
    }
}