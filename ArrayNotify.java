abstract class Notification {
    abstract void send();
    abstract void changeNotification();


    String name;
    String massage;
    Notification(String name , String massage){
        this.name =name;
        this.massage = massage;
    }
}

class EmailNotification extends Notification {

    EmailNotification(String name , String massage){
       super(name,massage);
    }

    @Override
    void send() {
        System.out.println("Sending Email Notification "+ name);
    }

    @Override
    void changeNotification() {
        System.out.println("Changing Email Notification");
    }
}

class SMSNotification extends Notification {

    SMSNotification(String name , String massage){
        super(name,massage);
    }

    @Override
    void send() {
        System.out.println("Sending SMS Notification"+name);
    }

    @Override
    void changeNotification() {
        System.out.println("Changing SMS Notification");
    }
}

public class ArrayNotify {
    public static void main(String[] args) {

        Notification[] n1 = {new EmailNotification("abi","bot") , new SMSNotification("ben","angle")};
        for(Notification a:n1){
            a.send();
            a.changeNotification();
        }
    }
}