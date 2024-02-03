package in_out.checkSumOfStream;

import java.io.*;
import java.nio.file.Path;

public class OutputStream {

    public static void main(String[] args) throws IOException {
/*
        File file = new File(String.join(File.separator, "src", "checkSumOfStream", "new_file.html");
*/

        File file = Path.of("src", "checkSumOfStream", "new_file.html").toFile();
        System.out.println(file.createNewFile());
        try(InputStream inputStream = new FileInputStream(file)) {
            byte[] b = inputStream.readAllBytes();
            System.out.println(new String(b));
        }
    }
    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        return 0;
    }
}