package ridesharing.model;

public class Rider extends User {
    private String vehicleType;
    private boolean isAvailable;
    private String currentLocation;

    public Rider(int id, String name, String phoneNo, String location,
                 String vehicleType, boolean isAvailable, String currentLocation) {
        super(id, name, phoneNo, location);
        this.vehicleType = vehicleType;
        this.isAvailable = isAvailable;
        this.currentLocation = currentLocation;
    }

    public String getVehicleType() { return vehicleType; }
    public boolean isAvailable() { return isAvailable; }
    public String getCurrentLocation() { return currentLocation; }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}