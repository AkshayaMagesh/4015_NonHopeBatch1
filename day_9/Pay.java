package day_9;

interface Payment {
    int calculatePayment();
}

abstract class Employee implements Payment {
    String name;
    int moneyPerDay;
    int days;

    Employee(String name, int moneyPerDay, int days) {
        this.name = name;
        this.moneyPerDay = moneyPerDay;
        this.days = days;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, int moneyPerDay, int days) {
        super(name, moneyPerDay, days);
    }

    public int calculatePayment() {
        return moneyPerDay * days;
    }
}

public class Pay {
    public static void main(String[] args) {

        Employee e = new FullTimeEmployee("Akshi", 500, 20);

        e.display();
        System.out.println("Salary: " + e.calculatePayment());
    }
}