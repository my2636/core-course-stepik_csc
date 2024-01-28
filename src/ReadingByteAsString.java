import java.io.*;
import java.nio.charset.Charset;

public class ReadingByteAsString {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new ByteArrayInputStream(new byte[] {}), Charset.forName("US-ASCII")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder sb =  new StringBuilder();
        int readedByte;
        while ((readedByte = reader.read()) != -1) {
            sb.append((char) readedByte);
        }
        return sb.toString();
    }
}
