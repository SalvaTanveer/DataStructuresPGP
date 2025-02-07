package TwoPointer_SlidingWindow;

import java.util.Arrays;

public class TwoSum {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
}
