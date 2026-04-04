package HolidayTask.VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {

        RentalService service = new RentalService();

        Vehicle car1 = new Car(1, 1000, 5);
        Vehicle bike1 = new Bike(2, 500, 150);

        service.addVehicle(car1);
        service.addVehicle(bike1);

        Customer customer1 = new Customer(1, "John", "DL12345");

        System.out.println("Available Vehicles:");
        service.showAvailableVehicles();

        service.rentVehicle(customer1, 1, 3);

        service.rentVehicle(customer1, 1, 2);

        service.returnVehicle(1);

        service.rentVehicle(customer1, 1, 2);
    }
}