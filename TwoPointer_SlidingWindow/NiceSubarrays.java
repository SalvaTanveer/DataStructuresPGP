package TwoPointer_SlidingWindow;

public class NiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        return solve(nums, k) - solve(nums, k - 1);
    }

    public int solve(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0, odd = 0, cnt = 0;
        while (r < n) {
            if (nums[r] % 2 == 1) {
                odd++;
            }
            while (odd > k) {
                if (nums[l] % 2 == 1) {
                    odd--;
                }
                l++;
            }
            cnt += r - l + 1;
            r++;
        }
        return cnt;
    }
}
