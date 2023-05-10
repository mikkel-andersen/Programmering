package model2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        String[] s = new String[9];
        ArrayList<model2.Customer> customers = new ArrayList<>();
        model2.Customer c1 = new model2.Customer("Andersen", "Mikkel", 23); s[0] = c1.getFirstName();
        model2.Customer c2 = new model2.Customer("Ødegaard", "Mathias", 21); s[1] = c2.getFirstName();
        model2.Customer c3 = new model2.Customer("Ingemann", "Peter", 48); s[2] = c3.getFirstName();
        model2.Customer c4 = new model2.Customer("Lujan", "Hailey", 22); s[3] = c4.getFirstName();
        model2.Customer c5 = new model2.Customer("Rosager", "Morten", 49); s[4] = c5.getFirstName();
        model2.Customer c6 = new model2.Customer("Nielsen", "Tina", 50); s[5] = c6.getFirstName();
        model2.Customer c7 = new model2.Customer("Langevin", "Emma", 25); s[6] = c7.getFirstName();
        model2.Customer c8 = new model2.Customer("Tully", "Sebastian", 22); s[7] = c8.getFirstName();
        model2.Customer c9 = new model2.Customer("Kraul", "Anders", 22); s[8] = c9.getFirstName();

        customers.add(c1); customers.add(c2); customers.add(c3); customers.add(c4); customers.add(c5);
        customers.add(c6); customers.add(c7); customers.add(c8); customers.add(c9);

        insertionSort(s);
        System.out.println(Arrays.toString(s));
        insertionSortObject(customers);
        System.out.println(customers);


        ArrayList<String> customers2 = new ArrayList<>();
        customers2.add("Mikkel");
        customers2.add("Frederik");
        customers2.add("Kraul");
        customers2.add("Jægerbombs");
        customers2.add("Luder");
        customers2.add("Lujan");
        System.out.println(customers2);
        Collections.sort(customers2);
        System.out.println(customers2);



    }

    public static void insertionSort(String[] list) {
        for (int i = 1; i < list.length; i++) {
            String currentElement = list[i];
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                if (currentElement.compareTo(list[j - 1]) > 0) {
                    found = true;
                } else {
                    list[j] = list[j - 1];
                    j--;
                }
            }
            list[j] = currentElement;
        }
    }

    public static void insertionSortObject(ArrayList<model2.Customer> customers) {
        for (int i = 1; i < customers.size(); i++) {
            model2.Customer currentElement = customers.get(i);
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                if (currentElement.getFirstName().compareTo(customers.get(j - 1).getFirstName()) > 0) {
                    found = true;
                } else {
                    customers.set(j, customers.get(j - 1));
                    j--;
                }
            }
            customers.set(j, currentElement);
        }
    }



}
