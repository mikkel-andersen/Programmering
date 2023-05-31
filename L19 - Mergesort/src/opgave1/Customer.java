package opgave1;

public class Customer implements Comparable<Customer> {
    private String fornavn;
    private int alder;


    public Customer(String fornavn, int alder) {
        this.fornavn = fornavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public int getAlder() {
        return alder;
    }

    @Override
    public int compareTo(Customer o) {
        return this.fornavn.compareTo(o.fornavn);
    }

    @Override
    public String toString() {
        return  fornavn + " " +  alder;
    }
}