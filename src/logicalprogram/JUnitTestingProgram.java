package logicalprogram;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class JUnitTestingProgram {
    public static void main(String[] args) {
       twoBinary(12);
    }

    static void twoBinary(int x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Swap nibbles and find the new number\n" +
                "2. Find the resultant number is the number is a power of 2\n");

        System.out.println("\nEnter Choice: ");
        System.out.println("Binary is " + Integer.toBinaryString(x));
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int output = ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
                System.out.print(output);
                break;

            case 2:
                if (x <= 0) {
                    throw new IllegalArgumentException(x + " is too small.");
                }
                if ((x & -x) == x) {
                    System.out.println("It is power of two");
                }
        }
}
