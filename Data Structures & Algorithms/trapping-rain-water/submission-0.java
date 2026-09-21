class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int max = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    max += leftMax - height[left];
                }
            } else {
                right--;
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    max += rightMax - height[right];
                }
            }

        }

        return max;
        
    }
}