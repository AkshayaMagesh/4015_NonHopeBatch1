package day_7_task;

// Parent Class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

// Child Class
class Student extends Person {

    Student(String name) {
        super(name);
    }

    void issueBook(Book b) {
        if (b.isIssued == false) {
            b.isIssued = true;
            System.out.println(name + " issued " + b.title);
        } else {
            System.out.println("Book already issued");
        }
    }

    void returnBook(Book b) {
        b.isIssued = false;
        System.out.println(name + " returned " + b.title);
    }
}

// Book Class
class Book {
    String title;
    boolean isIssued;

    Book(String title) {
        this.title = title;
        this.isIssued = false;
    }
}

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {

        // create book
        Book b1 = new Book("Java Basics");

        // create student
        Student s1 = new Student("Akshi");

        // issue book
        s1.issueBook(b1);

        // return book
        s1.returnBook(b1);
    }
}