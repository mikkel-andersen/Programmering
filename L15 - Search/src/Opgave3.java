public class Opgave3 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 9, 13, 7, 9, 13};
        int[] arr2 = new int[]{7, 9, 13, 13, 9, 7};
        int[] arr3 = new int[]{1,2,3,4,5,5,5,5,2,4};

        System.out.println(sameAdjacent(arr));
        System.out.println(sameAdjacent(arr2));
        System.out.println(sameNumber(arr, 4));
    }

    public static boolean sameAdjacent(int[] arr) {
        boolean sameAdjacent = false;
        int i = 0;

        while (!sameAdjacent && i < arr.length - 1) {
            int k = arr[i];
            if (k == arr[i + 1]) {
                sameAdjacent = true;
            } else {
                i++;
            }
        }
        return sameAdjacent;
    }

    public static boolean sameNumber(int[] arr, int n) {
        boolean sameNumber = false;
        int i = 0;
        int count = 1;
        while (!sameNumber && i < arr.length - 1) {
            int k = arr[i];
            for (int j = i; j <= n; j++) {
                int k1 = arr[j + 1];
                if (k == k1) {
                    count++;
                }
            }
            i++;
        }
        return sameNumber;
    }
}
