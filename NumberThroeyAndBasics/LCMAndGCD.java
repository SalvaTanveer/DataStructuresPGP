package NumberThroeyAndBasics;

public class LCMAndGCD {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int[] ans = new int[2];
        if (b < a) {
            lcmAndGcd(b, a);
        }
        ans[0] = a * b / gcd(a, b);
        ans[1] = gcd(a, b);

        return ans;

    }

    public static int gcd(int a, int b) {
        while (a > 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
}
