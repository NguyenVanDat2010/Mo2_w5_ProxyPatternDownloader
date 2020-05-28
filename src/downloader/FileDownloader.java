package downloader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    OutputStream out = null;
    URLConnection conn = null;
    InputStream in = null;
    String address;

    public FileDownloader(String address) {
        this.address = address;
    }

    public FileDownloader() {
    }

    @Override
    public void download() {
        try {
            URL url = new URL(address);
            out = new BufferedOutputStream(new FileOutputStream(url.getFile()));    //ghi
            conn = url.openConnection();
            in = conn.getInputStream();     //đọc
            byte[] buffer = new byte[1024];

            int numberRead;
            long numWritten = 0;

            while ((numberRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, numberRead);
                numWritten += numberRead;
            }

            System.out.println("Download \t" + numWritten);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
            }
        }
    }
}
