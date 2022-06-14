package logicalprogram;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class JUnitTestingProgram {
    public static void main(String[] args) {
       temperatureConvertor();
    }
    static void temperatureConvertor(double value) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celcius to Fahrenheit\n" +
                "2. Fahrenheit to Celcius\n");
        System.out.println("\nEnter Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                value = (value * 9 / 5) + 32;
                System.out.println("Celcius to Fahrenheit: " + value);
                break;
            case 2:
                value = (value - 32) * 5 / 9;
                System.out.println("Fahrenheit to Celcius: " + value);
                break;
        }
    }
}
