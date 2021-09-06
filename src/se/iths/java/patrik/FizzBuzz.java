package se.iths.java.patrik;

public class FizzBuzz {

    public static void main(String[] args) {

        // Alt: 1 IF / Fori
        for (int i = 1; i <= 100; i++) {
            printFizzBuzzForValue(i);
        }

        System.out.println("\n");

        // Alt: 2 SWITCH, mindre än 15 alternativ
        for (int i = 1; i <= 100; i++) {
            System.out.print(printFizzBuzzForValueWithSwitch(i));
        }

    }

    private static void printFizzBuzzForValue(int i) {
        if (i % 3 == 0 && i % 5 == 0)           // (i % 3*5 == 0) eller (i % 15 == 0) Bara delbart med 15
            System.out.print("FizzBuzz, ");
        else if (i % 3 == 0)
            System.out.print("Fizz, ");
        else if (i % 5 == 0)
            System.out.print("Buzz, ");
        else
            System.out.print(i + ", ");
    }

    private static String printFizzBuzzForValueWithSwitch(int i) {
        return switch (i % 15) {
            case 0 -> "FizzBuzz, ";
            case 3, 6, 9, 12 -> "Fizz, ";
            case 5, 10 -> "Buzz, ";
            default -> "" + i + ", "; // Integer.toString(i);
        };
    }
}
