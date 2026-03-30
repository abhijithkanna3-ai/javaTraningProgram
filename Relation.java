class Battery{
    public void powerSupply(){
        System.out.print("still have 14% power");
    }

}
class Remote{
    Battery miniBattery ;
    Remote(){
        miniBattery = new Battery();
    }
}
class Tv {
    Remote tool;
    Tv(Remote tool){
        this.tool =tool;
    }
}
public class Relation {
    public static void main(String [] args){
        Remote tv = new Remote();
        Tv sony = new Tv();
    }
}