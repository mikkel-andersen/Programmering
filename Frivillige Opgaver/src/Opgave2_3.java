import java.util.Scanner;
public class Opgave2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a value for feet");
        double feet = in.nextDouble();
        double footToMeter = 0.305; // One foot is 0.305 meter
        double feetToMeter = feet * footToMeter; // Calculates and stores the value

        System.out.println(feet + " feet is " + feetToMeter + " meters");

    }
}
