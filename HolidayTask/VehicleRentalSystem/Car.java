package HolidayTask.VehicleRentalSystem;

class Car extends Vehicle{

    private int numberOfSeats;
    Car(int id, int pricePerDay, int numberOfSeats) {
        super(id, pricePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int calculateRent(int days) {
        return getPricePerDay() * days;
    }
}