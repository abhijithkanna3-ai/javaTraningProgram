package ridesharing.model;

public class User {
    private int id;
    private String name;
    private String phoneNo;
    private String location;

    public User(int id, String name, String phoneNo, String location) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.location = location;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhoneNo() { return phoneNo; }
    public String getLocation() { return location; }

    public void setLocation(String location) {
        this.location = location;
    }
}