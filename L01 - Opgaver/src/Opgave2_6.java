import java.util.Scanner;

public class Opgave2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit, sum = 0;

        //Will divide number by 10 and store the remainder in the value digit, then add it to sum
        System.out.println("Enter a number from 0 - 1000");
        int number = in.nextInt();
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;

        }
        System.out.println("Sum af tal " + sum);

    }
}
