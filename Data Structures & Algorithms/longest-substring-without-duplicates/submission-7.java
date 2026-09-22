class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            res = Math.max(res, end - start + 1);
        }

        return res;
        
    }
}
