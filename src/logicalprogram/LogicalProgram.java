package logicalprogram;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class LogicalProgram {
    public static void main(String[] args) {
        stopWatch();
    }

    static void stopWatch() {
        long startTime = 0;
        long stopTime = 0;
        int run = 1;
        double running = Math.floor(Math.random() * 10) % 2;

        if (running == run) {
            startTime = System.currentTimeMillis();
        } else stopTime = System.currentTimeMillis();

        long elapsed;
        if (running == run) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }

        System.out.println("elapsed time in milliseconds: " + elapsed);
    }
}