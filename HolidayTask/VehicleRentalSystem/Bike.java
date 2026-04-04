package HolidayTask.VehicleRentalSystem;

class Bike extends Vehicle{

    private int numberOfSeats;
    Bike(int id, int pricePerDay, int numberOfSeats) {
        super(id, pricePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int calculateRent(int days) {
        return getPricePerDay() * days;
    }
}
