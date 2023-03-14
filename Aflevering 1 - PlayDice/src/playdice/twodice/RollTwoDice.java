package playdice.twodice;

import java.util.Scanner;

public class RollTwoDice {
    private static int rollCount = 0;
    private static int sum = 0;
    private static int sameEyes = 0;
    private static int highestThrow = 0;
    private static int[] dieOccurrence = new int[6];

    public static void main(String[] args) {
        System.out.println("Welcome to the game of RollTwoDice");
        printRules();
        System.out.println();

        playTwoDice();

        System.out.println();
        System.out.println("Thank you for playing RollTwoDice");
    }

    private static void playTwoDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll? ('no' stops) ");
        String answer = scanner.nextLine();
        while (!answer.equals("no")) {
            int[] face = rollDice();

            System.out.println("Eyes: " + face[0] + ", " + face[1]);
            System.out.println();

            updateStatistics(face);

            System.out.print("Roll? ('no' stops) ");
            answer = scanner.nextLine();
        }

        printStatistics();
        scanner.close();
    }

    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of RollTwoDice:");
        System.out.println("The player throws two dice as long as he/she wants.");
        System.out.println("=====================================================");
    }

    public static int[] rollDice() {
        int[] toReturn = new int[2];
        toReturn[0] = (int) (Math.random() * 6 + 1);
        toReturn[1] = (int) (Math.random() * 6 + 1);
        return toReturn;
    }

    private static void updateStatistics(int[] face) {
        rollCount++;
        sum += face[0] + face[1];
        if (face[0] == face[1]) {
            sameEyes++;
        }
        if (face[0] + face[1] > highestThrow) {
            highestThrow = face[0] + face[1];
        }


        dieOccurrence[face[0] - 1]++;
        dieOccurrence[face[1] - 1]++;


    }

    private static void printStatistics() {
        System.out.println("\nResults:");
        System.out.println("-------");
        System.out.printf("%17s %4d\n", "Roll count: ", rollCount);
        System.out.printf("%17s %4d\n", "Sum of rolls: ", sum);
        System.out.printf("%17s %4d\n", "Same eyes: ", sameEyes);
        System.out.printf("%17s %4d\n", "Highest throw: ", highestThrow);

        for (int i = 0; i < dieOccurrence.length; i++) {

            if (dieOccurrence[i] > 0 && dieOccurrence[i] == 1) {
                System.out.println(i + 1 + " occurs " + dieOccurrence[i] + " time.");
            } else if (dieOccurrence[i] >= 2) {
                System.out.println(i + 1 + " occurs " + dieOccurrence[i] + " times.");
            }
        }

    }
}
