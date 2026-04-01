abstract class NotificationP{
    abstract void send();
}

class BatteryNotification extends NotificationP{
        @Override
        void send(){
            System.out.println();
        }
}

class MassageNotification extends NotificationP{
    @Override
    void send(){
        System.out.println();
    }
}

class RemainderNotification extends NotificationP{
    @Override
    void send{
        System.out.println();
    }
}


interface Signal {
    boolean isSignal();
}

class BatterySignal implements Signal{
    int percentage;
    BatterySignal (int percentage){
        this.percentage = percentage;
    }
    boolean isSignal(){
        return percentage < 20;
    }
}

class MassageSignal implements Signal{
    boolean massage;
    MassageSignal (boolean massage){
        this.massage = massage;
    }
    boolean isSignal(){
        return massage;
    }
}

class RemainderSignal implements Signal{
    int time;
    RemainderSignal(int time){
        this.time = time;
    }
    boolean isSignal(){
        return time==9;
    }
}

interface Motion{
    boolean execute();
}

class isMotion implements Motion
public class CellPhone{
    public static void main(String [] args){

    }
}