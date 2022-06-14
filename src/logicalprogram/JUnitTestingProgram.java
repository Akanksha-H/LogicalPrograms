package logicalprogram;

public class JUnitTestingProgram {
    public static void main(String[] args) {
        currencyCodes(4515);
    }
    static void currencyCodes(int inputAmount) {
        int[] notes = new int[]{1000, 500, 200, 100, 50, 10, 5, 2, 1};
        int[] noteCounter = new int[9];
        System.out.println("Enter the amount in vending machine: ");

        for (int i = 0; i < 9; i++) {
            if (inputAmount >= notes[i]) {
                noteCounter[i] = inputAmount / notes[i];
                inputAmount = inputAmount - noteCounter[i] * notes[i];
            }
        }
        System.out.println("The number of notes out ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }
    }
}
