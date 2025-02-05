package Recursion_Backtracking;

public class ReverseString {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    public void reverse(char[] arr, int s, int e) {
        // if only one element is left no need to swap it with itself, just return
        if (s >= e) {
            return;
        }
        // swapping last and first characters
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        // reverse remaining elements
        reverse(arr, s + 1, e - 1);
    }
}
