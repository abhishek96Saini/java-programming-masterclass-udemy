package UsingConstructors;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String e_mail;
    private String phoneNumber;

    public void depositAmount(double deposit) {
        this.balance += deposit;
        System.out.println("Amount " + deposit + "credited. Total Balance: " + balance + "\n");
    }

    public void withdrawAmount(double deposit) {
        if (this.balance - deposit > 0) {
            this.balance -= deposit;
            System.out.println("Amount " + deposit + " credited. Total Balance: " + this.balance + "\n");
        } else {
            System.out.println("Insufficient balance. Transaction cancelled of "  + deposit + " . Total Balance: " + this.balance + "\n");
        }
    }

    // default constructor
    public Account() {
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public Account(int accountNumber, double balance, String customerName, String e_mail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.e_mail = e_mail;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
