import java.util.Scanner;
import java.lang.Math;

public class Opgave3_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c, r1, r2;


        System.out.println("Enter value of a: ");
        a = input.nextDouble();
        System.out.println("Enter value of b: ");
        b = input.nextDouble();
        System.out.println("Enter value of c: ");
        c = input.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0) {
            System.out.println("Equation has no real roots");
        }
        
        if (d == 0) {
            r1 = (-b + Math.pow(d, 5)) / (2 * a);
            r2 = (-b - Math.pow(d, 5)) / (2 * a);
            if (r1 == r2) {
                System.out.println("Equation has one root " + r1);
            }
        }

        if (d > 0) {
            r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("Equation has two roots " + r1 + " and " + r2);
        }

    }
}
