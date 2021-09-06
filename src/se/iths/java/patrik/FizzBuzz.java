package se.iths.java.patrik;

public class FizzBuzz {

    public static void main(String[] args) {

        // Alt: 1 IF / Fori
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)           // (i % 3*5 == 0) eller (i % 15 == 0) Bara delbart med 15
                System.out.print("FizzBuzz, ");
            else if (i % 3 == 0)
                System.out.print("Fizz, ");
            else if (i % 5 == 0)
                System.out.print("Buzz, ");
            else
                System.out.print(i + ", ");
        }

        // Alt: 2 SWITCH, mindre än 15 alternativ
        for (int i = 1; i <= 100; i++) {
            switch (i % 15) {
                case 0 -> System.out.println("FizzBuzz");
                case 3, 6, 9, 12 -> System.out.println("Fizz");
                case 5, 10 -> System.out.println("Buzz");
                default -> System.out.println(i);
            }
        }

    }
}
