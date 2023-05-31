package opgave3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeArrayOgList {
    public static void main(String[] args) {
        Customer c1 = new Customer("Peter", 23);

        Customer c2 = new Customer("Anders", 25);

        Customer c3 = new Customer("Rasmus", 22);

        Customer c4 = new Customer("Tiemen", 23);

        Customer c5 = new Customer("Lujan", 22);

        Customer c6 = new Customer("Mikkel", 23);

        Customer[] bank1 = new Customer[]{c1, c2, c3, c4};

        ArrayList<Customer> bank2 = new ArrayList<>();
        bank2.add(c4); bank2.add(c5); bank2.add(c6);
        Collections.sort(bank2);
        Arrays.sort(bank1);
        System.out.println(Arrays.toString(bank1));
        System.out.println(bank2);

        System.out.println(goodCustomer(bank2, bank1));
    }

    public static ArrayList<Customer> goodCustomer(ArrayList<Customer> l1, Customer[] l2) {
        ArrayList<Customer> goodCustomers = new ArrayList<>();
        int i = 0, i2 = 0;
        while (i < l1.size() && i2 < l2.length) {
            if (l1.get(i).compareTo(l2[i2]) < 0) {
                goodCustomers.add(l1.get(i));
                i++;
            } else if (l1.get(i).compareTo(l2[i2]) > 0) {
                i2++;
            } else {
                i++;
                i2++;
            }
        }
        return goodCustomers;
    }
}
