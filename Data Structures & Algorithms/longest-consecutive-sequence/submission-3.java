class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            // check if start of a sequence
            if (!set.contains(nums[i] - 1)) {
                int length = 0;
                while (set.contains(nums[i] + length)) {
                    length += 1;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;
        
    }
}
