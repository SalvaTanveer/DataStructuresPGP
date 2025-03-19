package NumberThroeyAndBasics;

//ou are given a 3-digit number n, Find whether it is an Armstrong number or not.
//An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

public class Armstrong {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += (int) Math.pow(lastDigit, 3);
            temp /= 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}
