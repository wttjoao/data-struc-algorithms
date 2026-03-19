class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> string_s = new HashMap<>();
        Map<Character, Integer> string_t = new HashMap<>();

        for (var ch: s.toCharArray()) {
            int count = 1;
            if (string_s.containsKey(ch)) {
                count++;
                string_s.put(ch, count);
            }
            string_s.put(ch, count);
        }

        for (var ch: t.toCharArray()) {
            int count = 1;
            if (string_t.containsKey(ch)) {
                count++;
                string_t.put(ch, count);
            }
            string_t.put(ch, count);
        }
        
        return string_s.equals(string_t);
    }
}
