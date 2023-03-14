import java.util.Scanner;
public class Opgave6_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter monthly interest rate: ");
        double monthlyInterestRate = input.nextDouble();
        System.out.println("Enter amount of years: ");
        int years = input.nextInt();

        futureInvestmentValue(investmentAmount, monthlyInterestRate, years);


    }

    public static void futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        int i = 1;
        double futureValue;
        System.out.println("The amount invested: " + investmentAmount);
        System.out.println("Annual interest rate: " + monthlyInterestRate);
        System.out.println("Years           Future value");

        while (i <= years) {

            futureValue = investmentAmount * Math.pow(((1 + monthlyInterestRate)), i);

            System.out.println((i + "           " + futureValue));
            i++;
        }

    }
}
