package playdice.pigsgame;

import java.util.Scanner;

public class Pigs {

    public static double player1Turn = 1.0;
    public static double player1RollCount = 0.0;
    public static double player2Turn = 1.0;
    public static double player2RollCount = 0.0;
    public static int player1Score = 0;
    public static int player2Score = 0;
    public static int tempSum = 0;
    public static int point = 0;

    public static int i = 1; // 1 is equal to player one and 2 is equal to player two

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game of pigs!");
        System.out.println("Enter the amount of points you need to win: ");
        point = scanner.nextInt();
        playPigs();
        printStatistics();
        System.out.println("Thanks for playing!");

    }

    public static void playPigs() {
        int rollCount = 0;

        if (player1Score >= point) {
            System.out.println("Player 1 wins!");
            return;
        } else if (player2Score >= point) {
            System.out.println("PLayer 2 wins!");
            return;
        }

        if (i == 1) {
            System.out.println("Player 1's turn");
            player1Turn++;
        } else {
            System.out.println("Player 2's turn");
            player2Turn++;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Roll? ('no' stops) \n");

        String answer = scanner.nextLine();
        while (player1Score < point && player2Score < point ) {
            while (!answer.equals("no")) {
                int face = rollDie();
                rollCount++;
                if (face == 1) {
                    System.out.println("You've rolled: " + face);
                    System.out.println("Next players turn\n");
                    tempSum = 0;
                    if (i == 1) {
                        player1RollCount += rollCount;
                        i++;
                        playPigs();
                    } else {
                        player1RollCount += rollCount;
                        i--;
                        playPigs();
                    }
                }



                System.out.println("Eyes: " + face + "\n");

                tempSum += face;

            if (i == 1) {
                if (player1Score + tempSum >= point) {
                    System.out.println("Player 1 wins!\n");
                    System.out.println("Player 1's score is: " + player1Score + tempSum);
                    break;
                }
            }
            if (i == 2) {
                if (player2Score + tempSum >= point) {
                    System.out.println("Player 1 wins!\n");
                    System.out.println("Player 2's score is: " + player2Score + tempSum);
                    break;

                }
            }


                System.out.println("Your score is " + tempSum + " this round");

                System.out.print("Roll again? ('no' stops) ");
                answer = scanner.nextLine();
                if (answer.equals("no")) {
                    if (i == 1) {
                        player1Score += tempSum;
                        player1RollCount += rollCount;
                        if (player1Score >= point) {
                            System.out.println("Player 1 wins!"); break;
                        }
                        System.out.println("Player 1 score: " + player1Score + "\n");
                        tempSum = 0;
                        i++;
                        playPigs();
                    } else {
                        player2Score += tempSum;
                        player2RollCount += rollCount;
                        if (player2Score >= point) {
                            System.out.println("Player 2 wins!"); break;
                        }
                        System.out.println("Player 2 score: " + player2Score + "\n");
                        tempSum = 0;
                        i--;
                        playPigs();
                    }
                }
            }
            break;
        }

    }

    private static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }

   public static void printStatistics() {
       System.out.println("==================================\n");
       System.out.println("Player 1's average throws per turn is: " + player1RollCount / player1Turn);
       System.out.println("Player 2's average throws per turn is: " + player2RollCount / player2Turn + "\n");
       System.out.println("==================================\n");
   }




}
