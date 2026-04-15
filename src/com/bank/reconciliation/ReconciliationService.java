package src.com.bank.reconciliation;

import java.util.*;

public class ReconciliationService {

    public void reconcile(List<Transaction> userList, List<Transaction> bankList) {
        System.out.println("\n--- Reconciliation Report ---\n");

        Collections.sort(userList);
        Collections.sort(bankList);

        Iterator<Transaction> userIt = userList.iterator();

        while (userIt.hasNext()) {
            Transaction userT = userIt.next();
            boolean found = false;

            for (Transaction bankT : bankList) {
                if (userT.id == bankT.id) {
                    found = true;
                    if (userT.amount == bankT.amount) {
                        System.out.println("Matched: " + userT);
                    } else {
                        System.out.println("Mismatch: " + userT + " | Bank Amount: " + bankT.amount);
                    }
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing in Bank: " + userT);
            }
        }
    }
}