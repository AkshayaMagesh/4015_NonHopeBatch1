package HolidayTask.VehicleRentalSystem;

abstract class Vehicle {
    private int id;
    private int pricePerDay;
    private boolean availability;

    Vehicle(int id, int pricePerDay) {
        this.id = id;
        this.pricePerDay = pricePerDay;
        this.availability = true;
    }

    public int getId() {
        return id;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void rentVehicle() {
        if(!availability) {
            System.out.println("Vehicle is not available.");
        }
        else {
            availability = false;
        }
    }

    public void returnVehicle() {
        availability = true;
    }

    public abstract int calculateRent(int days);
}



