package checkSumOfStream;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class СheckSumOfStream {

    public static void main(String[] args) throws IOException {
/*
        File file = new File(String.join(File.separator, "src", "checkSumOfStream", "new_file.html");
*/      File file = Path.of("src", "checkSumOfStream", "new_file.html").toFile();
        InputStream inputStream = new FileInputStream(file);
        byte[] b1 = {0x33, 0x45, 0x01};
        InputStream is = new ByteArrayInputStream(b1);
        System.out.println(checkSumOfStream(is));

    }
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int cs = 0;
            int oneByte = inputStream.read();
            while (oneByte != -1) {
                cs = Integer.rotateLeft(cs, 1) ^ oneByte;
                oneByte = inputStream.read();
        }
        return cs;
    }
}
