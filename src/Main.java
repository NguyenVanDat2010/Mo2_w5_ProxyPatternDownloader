import downloader.Client;
import downloader.FileDownloaderProxy;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        String address = "https://lh3.googleusercontent.com/C2_4Z4prTpMPqX1G9krkLnXi3uvlVY-3LxjIlx_N8-xfk_GoXSNgOvoHlQhn6SANShYOLhKXyB4HFtU9M2FFh6H0STHhBMosWUXvcHNv3wfKiNS7yFBzxOUgO5eDB5oOAF27cjin";
        client.download(address);
    }
}
