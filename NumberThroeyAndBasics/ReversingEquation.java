package NumberThroeyAndBasics;

import java.util.Stack;

//Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
public class ReversingEquation {
    String reverseEqn(String S) {
        // your code here
        Stack<String> stk = new Stack<>();
        StringBuilder exp = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (!Character.isDigit(ch)) {
                stk.push(exp.toString());
                exp.setLength(0);
                stk.push(ch + "");
            } else {
                exp.append(ch);
            }
        }
        if (!exp.equals("")) {
            stk.push(exp.toString());
        }
        StringBuilder ans = new StringBuilder();
        while (!stk.isEmpty()) {
            ans.append(stk.pop());
        }
        return ans.toString();

    }
}
