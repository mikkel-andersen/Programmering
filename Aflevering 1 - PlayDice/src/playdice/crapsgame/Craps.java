package playdice.crapsgame;

import java.util.Scanner;

public class Craps {
    private static int sum = 0;
    private static int point = 0;
    private static boolean won = false;

    public static void main(String[] args) {
        System.out.println("Welcome to the game of craps");
        printRules();
        System.out.println();
        playCraps();
    }

    public static void playCraps() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Come out roll ('no' stops) ");
        String answer = scanner.nextLine();
        while (!answer.equals("no")) {
            int[] face = rollDice();
            sum = face[0] + face[1];
            // System.out.println("You got: " + face[0] + ", " + face[1]);
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You rolled: " + sum);
                System.out.println("You lost!");
                break;
            } else if (sum == 7 || sum == 11) {
                System.out.println("You rolled: " + sum);
                System.out.println("You won!");
                break;
            } else {
                point = sum;
                System.out.println("You rolled: " + point);
                sum = 0;
                if (rollForPoint(point)) {
                    System.out.println("You won!");
                    break;
                } else {
                    System.out.println("You lost!");
                    break;
                }
            }
        }


    }

    public static boolean rollForPoint(int point) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Roll for point");

        while (won != true && sum != 7) {
            String answer = scanner.nextLine();
            while (!answer.equals("no")) {


                int[] roll = rollDice();
                sum = roll[0] + roll[1];
                System.out.println("You rolled: " + sum);


                if (sum == point) {
                    won = true;
                    break;
                }

                if (sum == 7) {
                    break;
                }
                System.out.println("Roll again!");
                answer = scanner.nextLine();
            }
        }

        return won;
    }

    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of Craps:");
        System.out.println("If the player rolls 7 or 11 in the first roll they win");
        System.out.println("If the player rolls 2, 3 or 12in the first roll they lose");
        System.out.println("If the player rolls 4, 5, 6 , 7, 8, 9 or 10 it will be the point for the player");
        System.out.println("The player will have to roll for the point now. If they roll point they win. If they roll 7 they lose");
        System.out.println("=====================================================");
    }


    public static int[] rollDice() {
        int[] toReturn = new int[2];
        toReturn[0] = (int) (Math.random() * 6 + 1);
        toReturn[1] = (int) (Math.random() * 6 + 1);
        return toReturn;
    }

}
