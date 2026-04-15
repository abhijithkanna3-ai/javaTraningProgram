package src.service;


import src.model.DownloadTask;

public class DownloadService {

    public void downloadFile(String fileName, int parts) {

        int fileSize = 100;
        int partSize = fileSize / parts;

        for (int i = 0; i < parts; i++) {

            int start = i * partSize;
            int end = (i == parts - 1) ? fileSize : start + partSize;

            DownloadTask task = new DownloadTask(fileName, start, end);

            Thread thread = new Thread(task); // Runnable passed here
            thread.start();
        }
    }
}