import java.nio.charset.Charset;

public class Ы {
    public static void main(String[] args) {
        String s = "Ы";
        byte[] b = s.getBytes(Charset.forName("UTF-8"));
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + 256);
        }

    }
}
