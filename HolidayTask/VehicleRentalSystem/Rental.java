package HolidayTask.VehicleRentalSystem;

public class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private int totalCost;

    public Rental(Customer customer, Vehicle vehicle, int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("Days must be greater than 0");
        }

        if (!vehicle.isAvailable()) {
            throw new IllegalStateException("Vehicle is not available");
        }

        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.totalCost = vehicle.calculateRent(days);

        vehicle.rentVehicle();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDays() {
        return days;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void completeRental() {
        vehicle.returnVehicle();
    }

    public void displayRentalInfo() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle ID: " + vehicle.getId());
        System.out.println("Days: " + days);
        System.out.println("Total Cost: " + totalCost);
    }
}