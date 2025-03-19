package NumberThroeyAndBasics;

public class SumOfDigitsIsPalindromeOrNot {
    int isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return isPrime(sum);
    }

    public static int isPrime(int n) {
        String str = n + "";
        int s = 0, e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return 0;
            }
            s++;
            e--;
        }
        return 1;
    }
}
