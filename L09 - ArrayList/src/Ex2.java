import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    /**
     * Tests all the methods.
     */
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);
//        ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
//        int total = sum1(ints);
//        System.out.println("Sum: " + total);


        // Test of sum() method: correct sum is 61.
        System.out.println("Sum: " + sum(ints));

        // Test of minimum() method: correct minimum is -16.
        System.out.println("The minimum in the ArrayList is: " + minimum(ints));
        // Test of maximum() method: correct maximum is 45.
        System.out.println("The maximum is the ArrayList is: " + maximum(ints));
        // Test of average() method: correct average is 7.625.
        System.out.println("The average of the list is: " + average(ints));
        // Test of zeroes() method: correct number of zeroes is 2.
        System.out.println("There are: " + zeroes(ints) + " zeroes");
        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        System.out.println(evens(ints));
    }

    // sum made with for statement
    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }

    public static int sum(ArrayList<Integer> ints) {
        int sum = 0;
        for (Integer n : ints) {
            sum += n;
        }
        return sum;
    }

    public static int minimum(ArrayList<Integer> ints) {
        int min = Integer.MAX_VALUE;

        for (Integer n : ints) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int maximum(ArrayList<Integer> ints) {
        int max = Integer.MIN_VALUE;

        for (Integer n : ints) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static double average(ArrayList<Integer> ints) {
        double average = 0;

        for (Integer n : ints) {
            average += n;
        }
        return average / ints.size();
    }

    public static int zeroes(ArrayList<Integer> ints) {
        int count = 0;

        for (Integer n : ints) {
            if (n == 0) {
                count++;
            }
        }
        return count;
    }


    public static ArrayList<Integer> evens(ArrayList<Integer> ints) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (Integer n : ints) {
            if(n % 2 == 0) {
                evens.add(n);
            }
        }
        return evens;
    }




}
