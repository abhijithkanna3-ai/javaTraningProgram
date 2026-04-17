

public class ThreadExample { //this is single Threading (one task at a time);
    public static void main(String [] args){
        task1();
        task2();
    }
    static void task1(){
        for(int i=0;i<5;i++){
            System.out.println("From Task 1 : "+i);
        }
    }
    static void task2(){
        for(int i=0;i<5;i++){
            System.out.println("From Task 2: "+i);
        }
    }
}
