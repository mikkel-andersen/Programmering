public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(1122, 20000);
        a1.setAnnualInterestRate(4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println(a1.getBalance());
        System.out.println(a1.getMonthlyInterest());
        System.out.println(a1.getDateCreated());
    }
}
