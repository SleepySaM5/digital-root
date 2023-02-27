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
        Door numberThreeDoor = new Door(3);
        Player Junpei = new Player(5);
        Player June = new Player(6);
        Player Ace = new Player(1);

        System.out.println(calculateDigitalRoot(Junpei.braceletNumber+June.braceletNumber+Ace.braceletNumber));
        if(calculateDigitalRoot(Junpei.braceletNumber+June.braceletNumber+Ace.braceletNumber) == numberThreeDoor.doorNumber) {
            System.out.println("Players can pass through door number " + numberThreeDoor.doorNumber);
        }
    }
}