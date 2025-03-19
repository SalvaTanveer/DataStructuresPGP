package NumberThroeyAndBasics;

//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

public class AddDigits {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
