public class Opgave2 {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 56, 34, 3, 7, 14, 13, 4};
        System.out.println(isInInterval(arr));
    }

    public static int isInInterval(int[] arr) {
        int firstInt = -1;
        int i = 0;
        while (firstInt == -1 && i < arr.length) {
            int k = arr[i];
            if (k >= 10 && k <= 15) {
                firstInt = k;
            } else {
                i++;
            }
        }
        return firstInt;
    }
}
