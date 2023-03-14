import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] valuesA = new int[10];
        for (int i = 0; i < valuesA.length; i++) {
            valuesA[i] = 0;

        }
        System.out.println(Arrays.toString(valuesA));

        int[] valuesB = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        System.out.println(Arrays.toString(valuesB));

        int[] valuesC = new int[10];
        for (int i = 0; i < valuesC.length; i++) {
            valuesC[i] = i;
        }
        System.out.println(Arrays.toString(valuesC));

        int[] valuesD = new int[10];
        int num = 2;
        for (int i = 0; i < valuesD.length; i++) {
            valuesD[i] = num;
            num += 2;
        }
        System.out.println(Arrays.toString(valuesD));

        int[] valuesE = new int[10];
        for (int i = 0; i < valuesE.length; i++) {
            valuesE[i] = (i + 1) * (i + 1);
        }
        System.out.println(Arrays.toString(valuesE));

        int[] valuesF = new int[10];

        for (int i = 0; i < valuesF.length; i++) {
            if (i % 2 == 0) {
                valuesF[i] = 0;
            } else {
                valuesF[i] = 1;
            }
        }
        System.out.println(Arrays.toString(valuesF));


        int[] valuesG = new int[10];
        for (int i = 0; i < valuesG.length; i++) {
            if (i > 4) {
                valuesG[i] = i - 5;

            } else {
                valuesG[i] = i;
            }
        }
        System.out.println(Arrays.toString(valuesG));

        int[] valuesH = new int[10];
        for (int i = 0; i < valuesH.length; i++) {
            if (i % 2 == 0) {
                valuesH[i] = i * 2;
            } else {
                valuesH[i] = i * 2 + 1;
            }
        }
        System.out.println(Arrays.toString(valuesH));


    }
}