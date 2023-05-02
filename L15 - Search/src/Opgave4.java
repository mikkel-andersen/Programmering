import java.util.ArrayList;

public class Opgave4 {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Fisk"); arr.add("Kat"); arr.add("Hund"); arr.add("Pingvin"); arr.add("Gris"); arr.add("Kat");
        System.out.println(findAllIndices(arr, "Kat"))  ;
    }

    public static ArrayList<Integer> findAllIndices(ArrayList<String> arr, String target) {
        ArrayList<Integer> indices = new ArrayList<>();
        int i = 0;
        for (String s : arr) {
            if (s.equals(target)) {
                indices.add(i);
            }
            i++;
        }



        return indices;
    }

}
