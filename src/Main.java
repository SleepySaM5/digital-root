import java.util.Scanner;

public class Main {
    /**
     * Returns the number of digits of a given positive number.
     * @param n A positive integer.
     * @return The number of digits of the input number.
     */
    static int countDigits(int n) {
        if(n == 0) {
            return 1;
        }
        int numberOfDigits = 0;
        
        while(n != 0) {
            n /= 10;
            numberOfDigits++;
        }

        return numberOfDigits;
    }
    static int sumOfDigits = 0;

    static int calculateSumOfNumber(int n) {
        if(n == 0)
            return 0;
        return n % 10 + calculateSumOfNumber(n/10);
    }

    static int calculateDigitalRoot(int n) {
        if(n == 0)
            return 0;
        int digitalRoot = n % 10 + calculateDigitalRoot(n / 10);
        if(countDigits(digitalRoot) > 1) {
            return calculateDigitalRoot(digitalRoot);
        }
        return digitalRoot;
    }

    public static void main(String[] args) {
        System.out.println(calculateDigitalRoot(5836734));
    }
}