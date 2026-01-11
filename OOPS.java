import java.util.*;

abstract class Bank {

    protected String bankName;
    protected List<Account> accounts = new ArrayList<>();

    public String getBankName(){
        return bankName;
    }

    public int getNumberOfAccounts(){
        return accounts.size();
    }

    public abstract Account createAccount(String accNo, String pass, double initialDeposit);
}


abstract class Account {

    protected String accountNumber;
    protected String password;
    protected double balance;

    public abstract void deposit(double amount, String password, String accountNumber);
    public abstract void withdraw(double amount, String password, String accountNumber);
    public abstract double getBalance(String password, String accountNumber);
}


class AxisBank extends Bank {

    AxisBank(){
        this.bankName = "Axis Bank";
    }

    @Override
    public Account createAccount(String accNo, String pass, double initialDeposit){

        Account acc = new AxisAccount(accNo, pass, initialDeposit);
        accounts.add(acc);
        return acc;
    }
}


class AxisAccount extends Account {

    AxisAccount(String accountNumber, String password, double initialDeposit){
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = initialDeposit;
    }

    public void deposit(double amount, String password, String accountNumber){
        if(!this.password.equals(password) || !this.accountNumber.equals(accountNumber)){
            System.out.println("Authentication Failed");
            return;
        }
        this.balance += amount;
    }

    public void withdraw(double amount, String password, String accountNumber){
        if(!this.password.equals(password) || !this.accountNumber.equals(accountNumber)){
            System.out.println("Authentication Failed");
            return;
        }
        if(this.balance < amount){
            System.out.println("Insufficient Balance");
            return;
        }
        this.balance -= amount;
    }

    public double getBalance(String password, String accountNumber){
        if(!this.password.equals(password) || !this.accountNumber.equals(accountNumber)){
            System.out.println("Authentication Failed");
            return -1;
        }
        return this.balance;
    }
}


class HDFCBank extends Bank {

    HDFCBank(){
        this.bankName = "HDFC Bank";
    }

    @Override
    public Account createAccount(String accNo, String pass, double initialDeposit){

        Account acc = new HDFCAccount(accNo, pass, initialDeposit);
        accounts.add(acc);
        return acc;
    }
}


class HDFCAccount extends Account {

    HDFCAccount(String accountNumber, String password, double initialDeposit){
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = initialDeposit;
    }

    public void deposit(double amount, String password, String accountNumber){
        if(!this.password.equals(password) || !this.accountNumber.equals(accountNumber)){
            System.out.println("Authentication Failed");
            return;
        }
        this.balance += amount;
    }

    public void withdraw(double amount, String password, String accountNumber){
        if(!this.password.equals(password) || !this.accountNumber.equals(accountNumber)){
            System.out.println("Authentication Failed");
            return;
        }
        if(this.balance < amount){
            System.out.println("Insufficient Balance");
            return;
        }
        this.balance -= amount;
    }

    public double getBalance(String password, String accountNumber){
        if(!this.password.equals(password) || !this.accountNumber.equals(accountNumber)){
            System.out.println("Authentication Failed");
            return -1;
        }
        return this.balance;
    }
}


public class OOPS {

    public static void main(String[] args) {

        AxisBank axis = new AxisBank();
        HDFCBank hdfc = new HDFCBank();

        Account a1 = axis.createAccount("111", "pass1", 1000);
        Account a2 = axis.createAccount("112", "pass2", 1500);

        Account h1 = hdfc.createAccount("211", "hpass", 2000);

        a1.deposit(500, "pass1", "111");

        System.out.println(axis.getBankName() + " Accounts: " + axis.getNumberOfAccounts());
        System.out.println(hdfc.getBankName() + " Accounts: " + hdfc.getNumberOfAccounts());

        System.out.println("Axis A1 Balance: " + a1.getBalance("pass1", "111"));
    }
}
