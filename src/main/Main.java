package src.main;

import src.service.DownloadService;

public class Main {
    public static void main(String[] args) {

        DownloadService service = new DownloadService();

        service.downloadFile("movie.mp4", 4);
    }
}