import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Calculate the digital root of: ");
        int numberToDigitize = inputNumber.nextInt();

        if(numberToDigitize < 0) {
            numberToDigitize *= -1;
        }

        System.out.println("Digits of the input number: ");
        while(numberToDigitize != 0) {
            int digit = numberToDigitize % 10;
            System.out.println(digit + " ");
            numberToDigitize /= 10;
        }

        // System.out.println("Digital root of " + numberToDigitize + " is the following: ");
    }
}