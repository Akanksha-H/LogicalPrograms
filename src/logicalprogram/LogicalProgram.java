package logicalprogram;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class LogicalProgram {
    public static void main(String[] args) {
        reverseNumber();
    }

    static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int reversed = 0;
        System.out.println("Original Number: " + num);

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}