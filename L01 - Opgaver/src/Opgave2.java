public class Opgave2 {
    public static void main(String[] args) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";

        //Lokal variabler til opgave 1 og 2
        String o1 = ord1.toUpperCase();
        String o2 = ord2.toLowerCase();

        //Lokal variabel til opgave 4
        String ord3 = ord1 + ord2.toLowerCase();

        //Opgave 1
        System.out.println(o1);

        //Opgave 2
        System.out.println(o2);

        //Opgave 3
        System.out.println(ord1 + " " + ord2);

        //Opgave 4
        System.out.println(ord3);

        //Opgave 5
        System.out.println("Ordet fra opgave 4 er " + ord3.length() + " bogstaver langt");

        //Opgave 6
        for (int i = 0; i < 7; i++) {
            System.out.print(ord1.charAt(i));
        }

        System.out.println();

        //Opgave 7
        for (int i = 2; i < 7; i++) {
            System.out.print(ord2.charAt(i));
        }
        System.out.println();

        //Opgave 8
        for (int i = ord3.length() / 2; i <= ord3.length() - 1; i++) {
            System.out.print(ord3.charAt(i));

        }
    }
}
