package ridesharing.main;

import ridesharing.model.*;
import ridesharing.service.RiderService; // ✅ IMPORTANT

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RiderService service = new RiderService(); // ✅

        service.addVehicle(new Vehicle("Bike", 10));
        service.addVehicle(new Vehicle("Car", 20));

        System.out.println("Enter Customer Details:");

        System.out.print("ID: ");
        int cid = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String cname = sc.nextLine();

        System.out.print("Phone: ");
        String cphone = sc.nextLine();

        System.out.print("Location: ");
        String clocation = sc.nextLine();

        Customer customer = new Customer(cid, cname, cphone, clocation);

        System.out.print("\nEnter number of riders: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Rider " + (i + 1) + " Details:");

            System.out.print("ID: ");
            int rid = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String rname = sc.nextLine();

            System.out.print("Phone: ");
            String rphone = sc.nextLine();

            System.out.print("Location: ");
            String rlocation = sc.nextLine();

            System.out.print("Vehicle Type: ");
            String vtype = sc.nextLine();

            Rider rider = new Rider(rid, rname, rphone,
                    rlocation, vtype, true, rlocation);

            service.addRider(rider);
        }

        System.out.println("\nEnter Ride Details:");

        System.out.print("Ride ID: ");
        int rideId = sc.nextInt();
        sc.nextLine();

        System.out.print("Source: ");
        String source = sc.nextLine();

        System.out.print("Destination: ");
        String destination = sc.nextLine();

        System.out.print("Vehicle Type (Bike/Car): ");
        String vehicleType = sc.nextLine();

        System.out.print("Distance: ");
        double distance = sc.nextDouble();

        Ride ride = service.createRide(
                rideId, customer, source, destination, distance, vehicleType
        );

        service.assignRider(ride);
        service.calculateFare(ride);
        service.printRideDetails(ride);

        sc.close();
    }
}