import java.util.Scanner;

public class Opgave6_6 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        displayPattern(n);

    }

    public static void displayPattern(int n) {
        int j = 1;
        int i = 1;
        int col = n;

        while (j <= col) {
            j++;
            i = 1;
            System.out.println();
            while (i < j) {
                System.out.print(i + " ");
                i++;

            }
        }
    }
}
