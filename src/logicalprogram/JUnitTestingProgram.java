package logicalprogram;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class JUnitTestingProgram {
    public static void main(String[] args) {
       squareRootUsingNewtonsMethod(12,1);
    }

    static void squareRootUsingNewtonsMethod(double n, double l) {
        double x = n;

        // The closed guess will be stored in the root
        double root;

        // To count the number of iterations
        int count = 0;

        while (true) {
            count++;
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < l)
                break;
            x = root;
        }
        System.out.println(root);
    }
}
