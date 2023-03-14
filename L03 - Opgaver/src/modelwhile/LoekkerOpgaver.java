package modelwhile;

public class LoekkerOpgaver {

    public static void main(String[] args) {

//        Kald af metoder der afprøver opgave 1
        System.out.println(summerEven(100));
        System.out.println(summerSquare(10));
        System.out.println(sumOdd(3, 19));
        allPowers(20);

    }

    // Metoden returnerer summen af alle lige tal mellem 2 og n
    public static int summerEven(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    // Metoden returnerer summen af alle kvdrater mellem 1*1 og n*n
    public static int summerSquare(int n) {
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i * i;
            i++;
        }

        return sum;
    }

    // Metoden returnerer summen af alle ulige tal mellem a og b
    public static int sumOdd(int a, int b) {
        int sum = 0;
        int i = a;

        while (i <= b) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }

        return sum;
    }

    // Metoden udskriver 2 potenser fra  f
    public static void allPowers(int n) {
        int i = 0;
        int potens = 1;

        while (i <= n) {
            System.out.println("2^" + i + " " + potens);
            potens = 2 * potens;
            i++;
        }


    }
}
