package HolidayTask.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class RentalService {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void showAvailableVehicles() {
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                System.out.println("Vehicle ID: " + v.getId() +
                                   ", Price per day: " + v.getPricePerDay());
            }
        }
    }

    public void rentVehicle(Customer customer, int vehicleId, int days) {
        Vehicle selected = null;

        for (Vehicle v : vehicles) {
            if (v.getId() == vehicleId) {
                selected = v;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Vehicle not found");
            return;
        }

        try {
            Rental rental = new Rental(customer, selected, days);
            rentals.add(rental);
            System.out.println("Rental successful!");
        } catch (Exception e) {
            System.out.println("Rental failed: " + e.getMessage());
        }
    }

    public void returnVehicle(int vehicleId) {
        for (Rental r : rentals) {
            if (r.getVehicle().getId() == vehicleId) {
                r.completeRental();
                System.out.println("Vehicle returned successfully!");
                return;
            }
        }

        System.out.println("Rental not found");
    }
}