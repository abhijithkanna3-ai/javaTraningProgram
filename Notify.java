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

public class Notify {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification("abi","bot");
        n1.send();
        n1.changeNotification();

        System.out.println();

        Notification n2 = new SMSNotification("ben","angle");
        n2.send();
        n2.changeNotification();
    }
}