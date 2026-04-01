class Locker {
    private int id ;
    private int pin ;
    private String  storeditem;
    private boolean islocked;
    private boolean block = true;
    Locker(int id , int pin){
        this.id = id;
        this.pin = pin;
        islocked = true ;
    }
    public boolean islocked(){
       return islocked;
    }

    public void storeitem(String item , int pin){
        if(this.pin == pin ){
            if(!islocked){
            storeditem =item;
            System.out.println("your item is stored ");
        }
        else{
            System.out.println("Locker is Locked");
        }
    }
        else{
            System.out.println("Entered pin is invalid");
        }
    }
    public  void retrieveitem(int pin ){
        if(this.pin == pin ){
            if(!islocked && storeditem!= null){
            System.out.println("retrieveitem "+storeditem);
            storeditem ="";
        }
        else if(storeditem==null){
            System.out.println("locker is empty");
        }
    }
    }
    public void lock(){
        islocked = true;
    }
    public void unlock(int pin){
        if(this.pin ==pin){
        islocked = false ;
    }
}
}
public class Task10{
    public static void main(String [] args){
        Locker a = new Locker(14,141414);
        a.unlock(141414);
        a.storeitem("watch",141414);
        a.retrieveitem(141414);


    }
}