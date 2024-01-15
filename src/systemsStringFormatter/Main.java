package systemsStringFormatter;

import checkSumOfStream.OutputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] b = {65, 13, 10, 10, 13};
        InputStream is = new ByteArrayInputStream(b);
        System.setIn(is);
        formatString();
    }

    static OutputStream formatString() throws IOException {
        int firstByte = System.in.read(), secondByte;
        if (firstByte >= 0){
            while ((secondByte = System.in.read()) >= 0) {
                if (firstByte != 13 || secondByte != 10) {
                    System.out.write(firstByte);
                    firstByte = secondByte;
                }
            }
        }
        return null;
    }
}
