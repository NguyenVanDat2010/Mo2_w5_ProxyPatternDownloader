package downloader;

public class Client {
    public void download(String address) {
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy(address);
        fileDownloaderProxy.download();
    }
}
