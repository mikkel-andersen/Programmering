import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Opg7_30 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int[] sekvens = new int[input.nextInt()];
        System.out.println("Enter the next number: ");
        for (int i = 0; i < sekvens.length; i++) {
            sekvens[i] = input.nextInt();
            //sekvens[i] = random.nextInt(100)+1;
        }

        System.out.println(Arrays.toString(sekvens));

        if(isConsecutiveFour(sekvens)) {
            System.out.println("The array does contain four consecutive numbers");
        } else {
            System.out.println("The array doesn't contain four consecutive numbers");
        }
    }
    public static boolean isConsecutiveFour(int[] values) {
        int count = 0;
        boolean con = false;

        if (values.length < 4 ) {
            return con;
        }

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i] == values[j]) {
                    count++;
                    if (count >= 4) {
                        con = true;
                        break;
                } else {
                    count = 0;
                }

                }
            }
        }
        return con;
    }
}
