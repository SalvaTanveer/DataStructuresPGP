package NumberThroeyAndBasics;

import java.util.Arrays;

//Given an integer n, return the number of prime numbers that are strictly less than n.(Brute force will give TLE)
public class CountPrime {
    public int countPrimes(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i <= n; i++) {
            if (prime[i] == true && i != n) {
                ++cnt;
            }
        }
        return cnt;
    }
}
