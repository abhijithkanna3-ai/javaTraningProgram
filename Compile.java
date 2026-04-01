public class Compile {
    public static void main(String[] args) {

        Thread T = new Thread(() -> {
            try {
                System.out.println("thread sleep");
                Thread.sleep(6000);
                System.out.println("thread wake");
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        });

        T.start();

        try {
            Thread.sleep(4000);
            System.out.println("main method thread");
        } catch (InterruptedException e) {   // FIXED (specific exception)
            System.out.println("Main thread interrupted");
        }

        T.interrupt();   // Interrupting the thread
    }
}