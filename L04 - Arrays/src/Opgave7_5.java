import java.util.Arrays;
import java.util.Scanner;
public class Opgave7_5 {
    public static void main(String[] args) {
        distinctNumber();
    }

    public static void distinctNumber() {
        int n = 0;
        int c = 0;
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            n = input.nextInt();
            if (n == 0) {
                array[i] = n;
            }
            for (int k = 0; k < array.length; k++) {
                if (n == array[k]) {
                    break;
            } else if (n != array[k] && i == k) {
                    c++;
                    array[c] = n;
                }
            }

        }

        System.out.println("Number of distinct numbers are: " + c);
        System.out.println("Distinct numbers are: " + Arrays.toString(array));

    }
}
