package TwoPointer_SlidingWindow;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int ans = Integer.MIN_VALUE;
        while (i < j) {
            int water = (j - i) * Math.min(height[i], height[j]);
            ans = Math.max(ans, water);
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}
