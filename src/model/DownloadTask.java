package src.model;

public class DownloadTask implements Runnable {

    private String fileName;
    private int start;
    private int end;

    public DownloadTask(String fileName, int start, int end) {
        this.fileName = fileName;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " downloading " + fileName +
                " from " + start + " to " + end);

        try {
            Thread.sleep(1000); // simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " finished");
    }
}