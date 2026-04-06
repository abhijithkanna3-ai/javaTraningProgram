package ridesharing.model;

public class Vehicle {
    private String vehicleType;
    private double pricePerKm;

    public Vehicle(String vehicleType, double pricePerKm) {
        this.vehicleType = vehicleType;
        this.pricePerKm = pricePerKm;
    }

    public String getVehicleType() { return vehicleType; }
    public double getPricePerKm() { return pricePerKm; }
}