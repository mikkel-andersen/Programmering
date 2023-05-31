package opgave1;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {

    public static void main(String[] args) {
        ArrayList<Customer> l1 = new ArrayList<>();
        ArrayList<Customer> l2 = new ArrayList<>();
        Customer c1 = new Customer("Mikkel", 23);
        l1.add(c1);
        Customer c2 = new Customer("Anders", 25);
        l1.add(c2);
        Customer c3 = new Customer("Lujan", 22);
        l1.add(c3);
        Collections.sort(l1);

        Customer c4 = new Customer("Plastik", 44);
        l2.add(c4);
        Customer c5 = new Customer("Rasmus", 23);
        l2.add(c5);
        Customer c6 = new Customer("Aaaa", 5);
        l2.add(c6);
        Customer c7 = new Customer("Henrik", 45);
        l2.add(c7);
        Customer c8 = new Customer("Helmig", 14);
        l2.add(c8);
        Customer c9 = new Customer("Jens", 28);
        l2.add(c9);
        Collections.sort(l2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(fletAlleKunder(l1, l2));

    }

    public static ArrayList<Customer> fletAlleKunder(ArrayList<Customer> l1, ArrayList<Customer> l2) {
        ArrayList<Customer> res = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;

        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo((l2.get(i2))) <= 0) {
                res.add(l1.get(i1));
                i1++;
            } else {
                res.add(l2.get(i2));
                i2++;
            }

            while (i1 < l1.size()) {
                res.add(l1.get(i1));
                i1++;
            }

            while (i2 < l2.size()) {
                res.add(l2.get(i2));
                i2++;
            }
        }
        return res;
    }
}
