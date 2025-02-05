package Recursion_Backtracking;

public class PrintNto1 {
    void printNos(int n) {
        // code here
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNos(n - 1);
    }
}
