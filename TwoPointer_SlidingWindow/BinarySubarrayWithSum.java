package TwoPointer_SlidingWindow;

public class BinarySubarrayWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = solve(nums, goal) - solve(nums, goal - 1);
        return ans;
    }

    public int solve(int[] nums, int goal) {
        int n = nums.length;
        int left = 0, right = 0, sum = 0, count = 0;
        while (right < n) {
            if (goal < 0) {
                return 0;
            }
            sum += nums[right];
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}
