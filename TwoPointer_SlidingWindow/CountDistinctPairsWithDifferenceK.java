package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class CountDistinctPairsWithDifferenceK {
    public int TotalPairs(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : map.keySet()) {
            // n1 - n2 = k ==> n2+k = n1
            if (k > 0 && map.containsKey(n + k)) {
                cnt++;
            } else if (k == 0 && map.get(n) > 1) { // if cnt > 1 then (eg: 4 - 4 = 0)
                cnt++;
            }
        }
        return cnt;
    }
}
