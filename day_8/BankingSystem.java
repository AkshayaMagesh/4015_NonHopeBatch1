package day_8;

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(1000);

        acc.deposit(500);
        acc.checkBalance();
        acc.withdraw(200);
        acc.checkBalance();
    }
}
class Account {
    private int balance;
    Account(int balance) {
        this.balance = balance;
    }
    void deposit(int deposit) {
        balance += deposit;
        System.out.println("Deposited: "+deposit);
    }

    void withdraw(int withdraw) {
        if(withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Amount withdrawn: "+withdraw);
        }
        else {
            System.out.println("Insufficient funds");
        }
    }

    void checkBalance() {
        System.out.println("Balance: "+ balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int balance) {
        super(balance);
    }
}



