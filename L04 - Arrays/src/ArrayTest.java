import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] numbers = {4, 6, 7, 2, 3};
        double[] doubles = {4.1, 6.2, 7.1, 2.1, 3.1};
        int[] a = {4, 6, 7, 2, 3};
        int[] b = {4, 6, 8, 2, 6};
        int[] c = {5, 8, 2, 5, 2, 9,};
        System.out.println("The sum of the array is: " + sum(numbers));
        System.out.println("The sum of the array is: " + doubleSum(doubles));
        System.out.println("The sum of the two arrays is: " + Arrays.toString(sumArrays(a, b)));
        System.out.println("The addition of two unequal arrays " + Arrays.toString(unequalLengths(a, c)));
        System.out.println("Does the array " + Arrays.toString(a) + " have an uneven number: " + hasUneven(a));
        System.out.println("Does the array " + Arrays.toString(b) + " have an uneven number: " + hasUneven(b));
    }

    public static double doubleSum(double[] t) {
        double sum = 0.0;

        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }

    public static int sum(int[] t) {
        int sum = 0;

        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }

    public static int[] sumArrays(int[] a, int[] b) { //Hvorfor int[] og ikke String?
        int[] c = new int[a.length];

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }

        return c;
    }

    public static int[] unequalLengths(int[] a, int[] b) {
        if (a.length >= b.length) {
            int[] unequal = new int[a.length];

            for (int i = 0; i < unequal.length; i++) {
                if (i < b.length)
                    unequal[i] = a[i] + b[i];
                else
                    unequal[i] = a[i];
            }

            return unequal;

        } else {
            int[] unequal2 = new int[b.length];

            for (int i = 0; i < unequal2.length; i++) {
                if (i < a.length)
                    unequal2[i] = a[i] + b[i];
                else
                    unequal2[i] = b[i];
            }

            return unequal2;

        }

    }

    public static boolean hasUneven(int[] t) {
        boolean hasUneven = false;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                hasUneven = false;
            } else {
                hasUneven = true;
                // break hvis ikke en vilkårlig array virker.
                //break;
            }
        }
        return hasUneven;
    }
}

