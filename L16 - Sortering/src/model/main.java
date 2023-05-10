package model;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String[] s = new String[9];
        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer("Andersen", "Mikkel", 23); s[0] = c1.getFirstName();
        Customer c2 = new Customer("Ødegaard", "Mathias", 21); s[1] = c2.getFirstName();
        Customer c3 = new Customer("Ingemann", "Peter", 48); s[2] = c3.getFirstName();
        Customer c4 = new Customer("Lujan", "Hailey", 22); s[3] = c4.getFirstName();
        Customer c5 = new Customer("Rosager", "Morten", 49); s[4] = c5.getFirstName();
        Customer c6 = new Customer("Nielsen", "Tina", 50); s[5] = c6.getFirstName();
        Customer c7 = new Customer("Langevin", "Emma", 25); s[6] = c7.getFirstName();
        Customer c8 = new Customer("Tully", "Sebastian", 22); s[7] = c8.getFirstName();
        Customer c9 = new Customer("Kraul", "Anders", 22); s[8] = c9.getFirstName();

        customers.add(c1); customers.add(c2); customers.add(c3); customers.add(c4); customers.add(c5);
        customers.add(c6); customers.add(c7); customers.add(c8); customers.add(c9);

        selectionSort(s);
        System.out.println(Arrays.toString(s));
        selectionSortObject(customers);
        System.out.println(customers.toString());
    }

    private static void swap(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void selectionSort(String[] s) {
        for (int i = 0; i < s.length; i++) {
            int currentMinIndex = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j].compareTo(s[currentMinIndex]) < 0) {
                    currentMinIndex = j;
                }

            }
            swap(s, i, currentMinIndex);
        }
    }

    private static void swapObject(ArrayList<Customer> customers, int i, int j) {
        Customer temp = customers.get(i);
        customers.set(i, customers.get(j));
        customers.set(j, temp);
    }

    public static void selectionSortObject(ArrayList<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            int currentMinIndex = i;
            for (int j = i + 1; j < customers.size(); j++) {
                if (customers.get(j).getFirstName().compareTo(customers.get(currentMinIndex).getFirstName()) < 0) {
                    currentMinIndex = j;
                }

            }
            swapObject(customers, i, currentMinIndex);
        }
    }


}
