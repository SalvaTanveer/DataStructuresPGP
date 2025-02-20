package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class SubarrayWithKDifferentIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums, k) - solve(nums, k - 1);
    }

    public int solve(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0, cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < n) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.size() > k) {
                map.put(nums[l], map.getOrDefault(nums[l], 0) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l = l + 1;
            }
            cnt += r - l + 1;
            r = r + 1;
        }
        return cnt;
    }
}
