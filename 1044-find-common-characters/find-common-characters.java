class Solution {
    public List<String> commonChars(String[] words) {
        int[] ansFreq = new int[26];
        Arrays.fill(ansFreq, Integer.MAX_VALUE);
        for (String word : words) {
            int[] freq = new int[26];
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                ansFreq[i] = Math.min(ansFreq[i], freq[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (ansFreq[i] > 0) {
                ans.add(String.valueOf((char) ('a' + i)));
                ansFreq[i]--;
            }
        }
        return ans;
    }
}