
package Recursion_Backtracking;

public class PowerOfX {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -n;
        }
        return pow(x, N);
    }

    public double pow(double x, long n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        double half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
