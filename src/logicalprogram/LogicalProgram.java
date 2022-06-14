package logicalprogram;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class LogicalProgram {
    public static void main(String[] args) {
        createCupon(4);
    }

    static String createCupon(int codeLength) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < codeLength; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        System.out.println(output);
        return output;
    }
}