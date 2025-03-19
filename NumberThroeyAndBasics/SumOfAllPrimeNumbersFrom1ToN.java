package NumberThroeyAndBasics;

import java.util.Arrays;

public class SumOfAllPrimeNumbersFrom1ToN {

    class Solution {
        public long prime_Sum(int n) {
            // code here
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
            long sum = 0;
            for (int i = 2; i <= n; i++) {
                if (prime[i] == true) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}
