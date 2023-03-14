public class Opgave6_2 {

    public static int sumOddDigits(int n) {
        int sum = 0;
        int digit =  n;

        while (digit != 0) {
            if(digit % 10 % 2 != 0) {
                sum += digit % 10;
            }
            digit /= 10;
        }
        return sum;


    }

    public static int sumDigits(int n) {
        int sum = 0;
        int digit = n;

        while (digit != 0) {
            sum += digit % 10;
            digit /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(2345));
        System.out.println(sumOddDigits(32677));
    }
}
