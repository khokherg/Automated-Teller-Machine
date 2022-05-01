package application;
import java.util.Date;

public class Account {
    private String _customerName;        // The customer's name
    private int _id;                     // The account number
    private double _balance = 0;         // The current account balance
    private double _annualInterestRate;  // Interest rate
    private Date date = new Date();      // The account creation date

    // Constructor

    public Account(int id, String name) {
        _id = id;
        _customerName = name;
    }

    // Getters and setters

    public String getCustomerName() {
        return _customerName;
    }

    public void setCustomerName(String customerName) {
        _customerName = customerName;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public double getBalance() {
        return _balance;
    }

    public void setBalance(double balance) {
        _balance = balance;
    }

    public double getAnnualInterestRate() {
        return _annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        _annualInterestRate = annualInterestRate;
    }

    public Date getDate() {
        return date;
    }

    // Deposit an amount of money.
    // TODO: Add error checking, e.g. amount should not be negative.
    public void deposit(double amount) {
        _balance += amount;
    }

    // Withdraw an amount of money.
    // TODO: Add error checking, e.g. amount should not be negative, balance should not go below zero.
    public void withdraw(double amount) {
        _balance -= amount;
    }

    // Calculate and return the monthly interest earned.
    public double monthlyInterest() {
        double interest = _balance * _annualInterestRate/12/100;
        return interest;
    }
}

