import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Hans");
        names.add("Viggo");
        names.add("Jens");
        names.add("Bente");
        names.add("Bent");

        System.out.println("Size of names arraylist is: " + names.size() + "\n");

        names.add(2, "Jane");
        System.out.println("Prints the elements of the arraylist");
        System.out.println(names);

        names.remove(1);

        names.add(0,"Pia");
        names.add(names.size(), "Ib");

        System.out.println("\nSize of names arraylist is: " + names.size());

        names.set(2, "Hansi");

        System.out.println("\nSize of names arraylist is: " + names.size());
        System.out.println("\nPrints the elements of the arraylist");
        System.out.println(names + "\n");

        System.out.println("for loop\n");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Length of" + names.get(i) + " is: " + names.get(i).length());
        }
        System.out.println("\nfor each loop \n");
        for (String str : names) {
            System.out.println("Length of " + str + " is: " + str.length());
        }

    }
}
