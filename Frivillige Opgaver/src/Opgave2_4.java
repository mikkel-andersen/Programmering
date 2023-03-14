import java.util.Scanner;
public class Opgave2_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number in pounds");
        double pounds = in.nextDouble();
        double poundToKg = 0.454;
        double kiloGram = pounds * poundToKg;

        System.out.println(pounds + " pounds is " + kiloGram + " kilograms");
    }
}
