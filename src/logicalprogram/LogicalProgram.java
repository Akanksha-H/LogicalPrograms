package logicalprogram;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class LogicalProgram {
    public static void main(String[] args) {
        perfectNumber();
    }

    static void perfectNumber() {
        Scanner scanner = new Scanner(System.in);
        int i, number, sum = 0;
        System.out.println("\n Please Enter any Number: ");
        number = scanner.nextInt();

        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.format("Given is a Perfect Number", number);
        } else {
            System.out.format("Given is NOT a Perfect Number", number);
        }
    }
}