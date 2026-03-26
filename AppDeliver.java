class User{
String name ;
String location;
int phone;
User(String name,String location,int phone){
    this.name =name;
    this.location=location;
    this.phone=phone;
} 

void displyinfo(){
    System.out.println("name of the user " + name);
     System.out.println("location of the user" + location);
     System.out.println("phone of the user" + phone);
    
}

}


class Food extends User{
    String fav;
    
Food(String name , String location ,int phone, String fav){
    super(name,location,phone);
    this.fav = fav;
}    
void info(){
    System.out.println("Fav Food of " + super.name +" is "+fav);
}
}


class Rider extends User{
    String vehicle;
Rider(String name , String location , int phone , String vehicle){
    super(name , location , phone );
    this.vehicle = vehicle;
}

void info(){
    System.out.println("Rider "+ name + " Riders " + vehicle+ " to deliver the food "  );
}
}
public class AppDeliver{
    public static void main(String [] args){
        User n;
        n  = new User("abi","Tirunelveli", 1);
        n.displyinfo();
        Food f  = new Food("abi","Tirunelveli",2,"dosa");
        f.info();
        Rider r =new Rider("abi","Tirunelveli", 1,"bike");
        r.info();

    }
}