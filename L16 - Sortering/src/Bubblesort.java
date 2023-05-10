import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        String[] s = new String[]{"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        bubbleSort(s);

        System.out.println(Arrays.toString(s));
    }

    public static void bubbleSort(String[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (s[j].compareTo(s[j + 1]) > 0) {
                    swap(s, j, j + 1);
                }
            }
        }
    }

    private static void swap(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }




}