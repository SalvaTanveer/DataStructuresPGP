package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int len = 0;
        while (left < n && right < n) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) != 1) {
                while (map.get(ch) > 1 && left < right) {
                    char l = s.charAt(left);
                    map.put(l, map.getOrDefault(l, 0) - 1);
                    left++;
                }
            }
            if (map.get(ch) == 1) {
                len = Math.max(len, right - left + 1);
                right++;
            }
        }
        return len;
    }
}
