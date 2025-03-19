package NumberThroeyAndBasics;

import java.util.ArrayList;

public class MultiplicationTable {
    static ArrayList<Integer> getTable(int N) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ans.add(N * i);
        }
        return ans;
    }
}
