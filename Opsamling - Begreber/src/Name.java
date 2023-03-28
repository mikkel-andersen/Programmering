public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

    public static void main(String[] args) {
        Name n = new Name("Mikkel", "Ødegaard", "Andersen");
        Name n2 = new Name("Mikkel", "Andersen");
        System.out.println(n.getFullName());
        System.out.println(n2.getFullName());
        System.out.println(n.getUsername());
        System.out.println(n2.getUsername());
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (middleName != null) {
            return firstName + " " + middleName + " " + lastName;
        } else {
            return firstName + " " + lastName;
        }

    }

    public String getUsername() {
        if (middleName != null) {
            String s1 = firstName.toUpperCase();
            return s1.substring(0, 2) + middleName.length() + lastName.substring(lastName.length() - 2, lastName.length());
        } else {
            String s1 = firstName.toUpperCase();
            return s1.substring(0, 2) + 0 +  lastName.substring(lastName.length() - 2, lastName.length());
        }
    }




}
