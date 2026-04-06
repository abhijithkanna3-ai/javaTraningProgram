package ridesharing.service;

import ridesharing.model.*;
import java.util.*;

public class RiderService {

    private List<Rider> riders = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addRider(Rider rider) {
        riders.add(rider);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Rider findAvailableRider(String location, String vehicleType) {
        for (Rider rider : riders) {
            if (rider.isAvailable()
                    && rider.getCurrentLocation().equalsIgnoreCase(location)
                    && rider.getVehicleType().equalsIgnoreCase(vehicleType)) {
                return rider;
            }
        }
        return null;
    }

    public Ride createRide(int rideId, Customer customer,
                           String source, String destination,
                           double distance, String vehicleType) {

        return new Ride(rideId, customer, source, destination, distance, vehicleType);
    }

    public void assignRider(Ride ride) {

        Rider rider = findAvailableRider(
                ride.getSourceLocation(),
                ride.getVehicleType()
        );

        if (rider != null) {
            ride.setRider(rider);
            rider.setAvailable(false);
            ride.setStatus("RIDER_ASSIGNED");
        } else {
            ride.setStatus("NO_RIDER_AVAILABLE");
        }
    }

    public void calculateFare(Ride ride) {

        double price = 0;

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase(ride.getVehicleType())) {
                price = v.getPricePerKm();
                break;
            }
        }

        ride.setFare(ride.getDistance() * price);
    }

    public void printRideDetails(Ride ride) {

        System.out.println("\n----- Ride Details -----");
        System.out.println("Ride ID: " + ride.getRideId());
        System.out.println("Customer: " + ride.getCustomer().getName());
        System.out.println("Vehicle Type: " + ride.getVehicleType());
        System.out.println("Rider: " +
                (ride.getRider() != null ? ride.getRider().getName() : "Not Assigned"));
        System.out.println("From: " + ride.getSourceLocation());
        System.out.println("To: " + ride.getDestinationLocation());
        System.out.println("Distance: " + ride.getDistance());
        System.out.println("Fare: " + ride.getFare());
        System.out.println("Status: " + ride.getStatus());
    }
}