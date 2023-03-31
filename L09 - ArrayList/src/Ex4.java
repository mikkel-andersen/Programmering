import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> ints2 = new ArrayList<>(List.of(10, 4, 5, 3, 5, 3, 13));

        ArrayList<Integer> ints3 = new ArrayList<>(List.of(2, 5, 8, 5));
        ArrayList<Integer> ints4 = new ArrayList<>(List.of(2, 5, 8, 6));

        System.out.println(switchFirstAndLast(ints));
        System.out.println(replaceWithZero(ints));
        System.out.println(secondHighest(ints));
        System.out.println(ascendingOrder(ints2));
        System.out.println(shiftOne(ints2));
        System.out.println(ints3 + " " + hasDoublets(ints3));
        System.out.println(ints4 + " " + hasDoublets(ints4));
        System.out.println(ints + " " + hasDoublets(ints));
        System.out.println(ints2 + " " + hasDoublets(ints2));


    }

    public static ArrayList<Integer> switchFirstAndLast(ArrayList<Integer> ints) {
        int temp;

        temp = ints.get(0);
        ints.set(0, ints.get(ints.size() - 1));
        ints.set(ints.size() - 1, temp);
        return ints;
    }

    public static ArrayList<Integer> replaceWithZero(ArrayList<Integer> ints) {
        for (int i = 0; i < ints.size() - 1; i++) {
            if (ints.get(i) % 2 == 0) {
                ints.set(i, 0);
            }
        }
        return ints;
    }

    public static int secondHighest(ArrayList<Integer> ints) {
        Collections.sort(ints);
        return ints.get(7);
    }

    public static boolean ascendingOrder(ArrayList<Integer> ints) {
        boolean sorted = false;

        for (int i = 0; i < ints.size() - 1; i++) {
            if (ints.get(i) <= ints.get(i + 1)) {
                sorted = true;
            } else {
                sorted = false;
                return sorted;
            }
        }
        return sorted;
    }

    public static ArrayList<Integer> shiftOne(ArrayList<Integer> ints) {
        int temp;
        int last = ints.get(ints.size() - 1);
        for (int i = 0; i < ints.size() - 1; i++) {
            temp = ints.get(i);
            ints.set(i, temp);
        }
        ints.add(0, last);
        ints.remove(ints.size() - 1);

        return ints;
    }

    public static boolean hasDoublets(ArrayList<Integer> ints) {
            for (int i = 0; i < ints.size(); i++) {
                for (int j = i+1; j < ints.size(); j++) {
                    if (ints.get(i) == ints.get(j)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
