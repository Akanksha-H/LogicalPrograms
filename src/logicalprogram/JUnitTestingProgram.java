package logicalprogram;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class JUnitTestingProgram {
    public static void main(String[] args) {
       binary(12);
    }

    static void binary(int i) {
        System.out.println("Binary is " + Integer.toBinaryString(i));
    }
}
