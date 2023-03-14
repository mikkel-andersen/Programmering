
public class OpgaveTalRækker_Opgave7 {

    public static String inorder(int n1, int n2, int n3) {
        if (n1 < n2 && n2 < n3) {
            return n1 + " " + n2 + " " + n3 + " er voksende";
        } else if (n1 > n2 && n2 > n3) {
            return n3 + " " + n2 + " " + n1 + " er aftagende";
        } else if (n1 < n2 && n2 > n3) {
            return n1 + " " + n2 + " " + n3 + " er hverken eller";
        }
        return null;
    }



    public static void main(String[] args) {

        System.out.println(inorder(1, 2 ,3));
        System.out.println(inorder(4, 3 ,2));
        System.out.println(inorder(3, 4 ,2));

    }
}
