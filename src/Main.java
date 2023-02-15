import java.util.Scanner;

public class Main {
    /**
     * Returns the number of digits of a given positive number.
     * @param n A positive integer.
     * @return The number of digits of the input number.
     */
    static int countNumberOfDigits(int n) {
        int numberOfDigits = 1;
        
        while(n > 9) {
            n /= 10;
            numberOfDigits++;
        }

        return numberOfDigits;
    }

    public static void main(String[] args) {
        int sumOfDigits = 0;
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Calculate the digital root of: ");
        int numberToDigitize = inputNumber.nextInt();

        if(numberToDigitize < 0) {
            numberToDigitize *= -1;
        }

        System.out.println("Digits of the input number: ");
        while(numberToDigitize != 0) {
            int digit = numberToDigitize % 10;
            sumOfDigits += digit;
            System.out.println(digit + " ");
            numberToDigitize /= 10;
        }

        System.out.println(sumOfDigits);
        System.out.println("number of digits: " + countNumberOfDigits(1234567));
        // System.out.println("Digital root of " + numberToDigitize + " is the following: ");
    }
}