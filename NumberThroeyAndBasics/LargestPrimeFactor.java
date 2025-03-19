package NumberThroeyAndBasics;

import java.util.ArrayList;
import java.util.Collections;

public class LargestPrimeFactor {
    static int largestPrimeFactor(int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(n);
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    al.add(i);
                    al.add(n / i);
                } else {
                    al.add(i);
                }
            }
        }
        Collections.sort(al);
        for (int i = al.size() - 1; i >= 0; i--) {
            int ele = al.get(i);
            if (isPrime(ele)) {
                return ele;
            }
        }
        return 1;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
