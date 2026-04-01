package day_10;

public class GetterSetter {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(10);
        System.out.println(acc.getBalance());
    }
}

class Account {
    private int balance;

    void setBalance(int balance) {
        this.balance = balance;

    }
    int getBalance() {
        return balance;
    }
}