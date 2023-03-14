public class Stars {
    public static void main(String[] args) {
//        exA(10);
        stars4A(10);

        stars4B(10);

        stars4C(10);

    }

    public static void exA(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {

            // print row number
            System.out.printf("%2d: ", row);

            // print stars
            int starCount = rowCount + 1 - row;
            for (int i = 1; i <= starCount; i++) {
                System.out.print('*');
            }

            // print dashes
            int dashCount = rowCount - starCount;
            for (int i = 1; i <= dashCount; i++) {
                System.out.print('-');
            }

            // new line
            System.out.println();
        }

    }

    public static void stars4A(int row) {

        for (int i = 1; i <= row; i++) {

            // print row number
            System.out.printf("%2d: ", i);

            // print stars
            int starCount = row + 1 - i;
            for (int j = 1; j <= starCount; j++) {
                System.out.print('*');
            }

            // print dashes
//            int dashCount = row - starCount;
//            for (int i = 1; i <= dashCount; i++) {
//                System.out.print('-');
//            }

            // new line
            System.out.println();
        }

    }

    public static void stars4C(int row) {

        for (int i = 1; i <= row; i++) {

            // print row number
            System.out.printf("%2d: ", i);


            // print dashes
            int starCount = row + 1 - i;
            int dashCount = row - starCount;
            for (int k = 1; k <= dashCount; k++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= starCount; j++) {
                System.out.print('*');
            }

            // new line
            System.out.println();
        }

    }

    public static void stars4B(int row) {

        for (int i = 1; i <= row; i++) {

            // print row number
            System.out.printf("%2d: ", i);


            // print dashes
            // Changed 
            int starCount = row + 1 - i;
            int dashCount = row - starCount;
            for (int k = 1; k <= starCount; k++) {
                System.out.print(' ');
            }

            for (int j = 0; j <= dashCount; j++) {
                System.out.print('*');
            }

            // new line
            System.out.println();
        }


    }
}
