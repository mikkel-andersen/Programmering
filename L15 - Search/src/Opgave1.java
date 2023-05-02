public class Opgave1 {

    public static void main(String[] args) {
        int[] arr = new int[]{100, 300,400,500, 44, 94, 76, 28, 13, 20};
        System.out.println(hasUneven(arr));

    }

    public static boolean hasUneven(int[] arr) {
        boolean hasUneven = false;
        int i = 0;
        while (!hasUneven && i < arr.length) {
            int k = arr[i];
            if (k % 2 != 0) {
                hasUneven = true;
            } else {
                i++;
            }
        }
        return hasUneven;
    }
}
