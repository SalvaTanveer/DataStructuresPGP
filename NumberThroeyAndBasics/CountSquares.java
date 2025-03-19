package NumberThroeyAndBasics;

//Given a positive integer n, find the number of perfect squares that are less than n in the sample space of perfect squares. The sample space consists of all perfect squares starting from 1 (i.e., 1, 4, 9, 16, 25, …)
public class CountSquares {
    static int countSquares(int n) {
        // code here
        int cnt = 0;
        for (int i = 1; i * i < n; i++) {
            cnt++;
        }
        return cnt;
    }
}
