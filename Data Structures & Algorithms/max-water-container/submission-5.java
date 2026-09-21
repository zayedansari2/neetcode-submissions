class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            int height = Math.min(heights[right], heights[left]);
            int area = width * height;

            max = Math.max(max, area);

            if (heights[right] < heights[left]) {
                right--;
            } else {
                left++;
            }
        }

        return max;
        
    }
}
