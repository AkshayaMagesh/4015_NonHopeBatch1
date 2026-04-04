package HolidayTask.VehicleRentalSystem;

public class Customer {
    private int id;
    private String name;
    private String licenseNumber;

    public Customer(int id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("License: " + licenseNumber);
    }
}