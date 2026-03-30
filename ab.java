abstract class Device {
    abstract void turnon();
    abstract void turnoff();
}
class light extends Device{
    @Override
    void turnon(){
        System.out.print("light on");
    }
    @Override
    void turnoff(){
        System.out.print("light off");
    }
    }


interface wifi{
    void connect();
}

class Tv implements wifi{
    public void connect(){
        System.out.print("connected ");
    }
}
public class ab{
    public static void main(String [] args){
        Device d ;
        d = new light();
        d.turnon();
    }
}