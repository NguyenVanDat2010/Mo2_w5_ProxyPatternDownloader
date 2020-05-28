package downloader;

public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;
    private String address = null;

    public FileDownloaderProxy(String address) {
        this.address = address;
        this.fileDownloader = new FileDownloader(this.address);
    }

    @Override
    public void download() {
        int lastSlashIndex = this.address.lastIndexOf('/');

        if (lastSlashIndex >= 0 && lastSlashIndex < address.length() - 1) {
            fileDownloader.download();
        } else {
            throw new RuntimeException("Could not figure out local file name for ");
        }
    }
}
