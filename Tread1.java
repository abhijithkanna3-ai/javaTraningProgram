class SampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread running using Thread class");
    }
}

class SampleThread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Threading is running ");
    }
}
public class Tread1 {
    public static void main(String [] args){
        SampleThread n = new SampleThread();
        n.start();//if you want to run the thread then you can run that by using start you can able to direclty run the thread :
        Thread t = new Thread(new SampleThread2());
        t.start();
}
}
