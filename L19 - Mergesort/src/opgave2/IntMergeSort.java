package opgave2;

import java.util.Arrays;

public class IntMergeSort {
    public static void main(String[] args) {
        int[] l1 = new int[]{2, 4, 6, 8, 10, 12, 14};
        int[] l2 = new int[]{1, 2, 4, 5, 6, 9, 12, 17};

        System.out.println(Arrays.toString(fællesTal(l1, l2)));

    }

    public static int[] fællesTal(int[] l1, int[] l2) {
        int[] res = new int[l1.length + l2.length];
        int i = 0; int j = 0; int i2 = 0;
        while (i < l1.length && i < l2.length) {
            if (l1[i] < l2[j]) {
                i++;
            } else if (l1[i] > l2[j]) {
                j++;
            } else {
                res[i2] = l1[i];
                i2++;
                i++;
                j++;
            }
        }
        return Arrays.copyOf(res, i2);
    }
}
