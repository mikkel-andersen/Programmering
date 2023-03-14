import java.util.Scanner;

public class Opg7_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int[] sekvens = new int[input.nextInt()];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < sekvens.length; i++) {
            sekvens[i] = input.nextInt();
        }
        if (isSorted(sekvens)) {
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] values) {
        boolean isSorted = false;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] <= values[i + 1]) {
                isSorted = true;
            } else {
                isSorted = false;
                return isSorted;
            }
        }
        return isSorted;
    }
}
