import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Account {
    private int id;
    public static int nextId;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    private LocalDateTime lastTransaction;

    public Account(double balance) {
        nextId++;
        this.id = nextId;
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        lastTransaction = LocalDateTime.now();
        System.out.println("Withdrawal made at: " + lastTransaction);
    }

    public void deposit(double amount) {
        this.balance += amount;
        lastTransaction = LocalDateTime.now();
        System.out.println("Deposit made at: " + lastTransaction);
    }
}
