package ridesharing.model;

public class Ride {
    private int rideId;
    private Customer customer;
    private Rider rider;
    private String sourceLocation;
    private String destinationLocation;
    private double distance;
    private double fare;
    private String status;
    private String vehicleType;

    public Ride(int rideId, Customer customer, String sourceLocation,
                String destinationLocation, double distance, String vehicleType) {

        this.rideId = rideId;
        this.customer = customer;
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
        this.distance = distance;
        this.vehicleType = vehicleType;
        this.status = "CREATED";
    }

    public int getRideId() { return rideId; }
    public Customer getCustomer() { return customer; }
    public Rider getRider() { return rider; }
    public void setRider(Rider rider) { this.rider = rider; }

    public String getSourceLocation() { return sourceLocation; }
    public String getDestinationLocation() { return destinationLocation; }
    public double getDistance() { return distance; }

    public String getVehicleType() { return vehicleType; }

    public double getFare() { return fare; }
    public void setFare(double fare) { this.fare = fare; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}