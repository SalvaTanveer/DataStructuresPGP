package NumberThroeyAndBasics;

//Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

public class CountDigits {
    static int evenlyDivides(int n) {
        // code here
        int temp = n;
        int cnt = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                temp /= 10;
                continue;
            }
            if (n % digit == 0) {
                cnt++;
            }
            temp /= 10;
        }
        return cnt;
    }
}
