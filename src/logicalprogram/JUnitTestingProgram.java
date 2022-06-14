package logicalprogram;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class JUnitTestingProgram {
    public static void main(String[] args) {
       monthlyPayment();
    }
    static double monthlyPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter loan amount: ");
        int loanAmount = scanner.nextInt();

        System.out.print("Enter loan term (in years): ");
        int termInYears = scanner.nextInt();

        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        // Convert interest rate into a decimal
        interestRate /= 100.0;

        // Monthly interest rate is the yearly rate divided by 12
        double monthlyRate = interestRate / 12.0;

        // The length of the term in months is the number of years times 12
        int termInMonths = termInYears * 12;
        double monthlyPayment =
                (loanAmount * monthlyRate) /
                        (1 - Math.pow(1 + monthlyRate, -termInMonths));
        System.out.println(monthlyPayment);
        return monthlyPayment;
    }
}
