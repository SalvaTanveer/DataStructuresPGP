package NumberThroeyAndBasics;

import java.util.ArrayList;

public class CommonFactors {
    public int commonFactors(int a, int b) {
        if (a == 1 && b == 1) {
            return 1;
        }
        int min = -1, max = -1;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 2; i * i <= min; i++) {
            if (min % i == 0) {
                if (i != min / i) {
                    al.add(i);
                    al.add(min / i);
                } else {
                    al.add(i);
                }
            }
        }
        al.add(min);
        int cnt = 1;
        for (int i = 0; i < al.size(); i++) {
            int ele = al.get(i);
            if (max % ele == 0) {
                ++cnt;
            }
        }
        return cnt;
    }
}
