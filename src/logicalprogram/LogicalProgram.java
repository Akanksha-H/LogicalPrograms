package logicalprogram;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class LogicalProgram {
    public static void main(String[] args) {
        primeNumber();
    }

    static void primeNumber() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}