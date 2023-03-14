import java.util.Scanner;
public class Opgave6_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want reversed: ");
        int number = input.nextInt();

        System.out.println(reverse(number));
    }

    public static int reverse(int n) {
        int digit = n;
        int reverseDigit = 0;


        while (digit != 0) {
            reverseDigit = reverseDigit * 10 + digit % 10;
            digit /= 10;
        }

        return reverseDigit;
    }
}
