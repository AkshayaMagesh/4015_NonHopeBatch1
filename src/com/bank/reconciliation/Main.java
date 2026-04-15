package src.com.bank.reconciliation;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        BankAccount userAccount = new BankAccount();
        BankAccount bankAccount = new BankAccount();

        userAccount.addTransaction(new Transaction(1, "2024-01-01", 1000, "Deposit"));
        userAccount.addTransaction(new Transaction(2, "2024-01-02", 500, "Withdrawal"));
        userAccount.addTransaction(new Transaction(3, "2024-01-03", 200, "Transfer"));

        bankAccount.addTransaction(new Transaction(1, "2024-01-01", 1000, "Deposit"));
        bankAccount.addTransaction(new Transaction(2, "2024-01-02", 500, "Withdrawal"));
        bankAccount.addTransaction(new Transaction(3, "2024-01-03", 300, "Transfer"));

        Collections.sort(userAccount.getTransactions(), new AmountComparator());

        ReconciliationService service = new ReconciliationService();
        service.reconcile(userAccount.getTransactions(), bankAccount.getTransactions());
    }
}