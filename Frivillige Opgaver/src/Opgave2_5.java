import java.util.Scanner;
public class Opgave2_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the subtotal");
        double subtotal = in.nextDouble();
        System.out.println("Enter the gratuity");
        double gratuityRate = (in.nextDouble()/100)+1;

        double total = subtotal * gratuityRate;
        double gratuity = total - subtotal;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}
