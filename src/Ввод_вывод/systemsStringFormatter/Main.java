package Ввод_вывод.systemsStringFormatter;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] b = {65, 66, 13, 10, 10, 13, 67, 68, 69};
        System.setIn(new ByteArrayInputStream(b));
        int firstByte = System.in.read(), secondByte = System.in.read();
        while (firstByte > 0) {
            if (firstByte == 13 && secondByte == 10) {
                System.out.write(secondByte);
                firstByte = System.in.read();
                secondByte = System.in.read();
                System.out.flush();
            }
            else {
                System.out.write(firstByte);
                firstByte = secondByte;
                secondByte = System.in.read();
                System.out.flush();
            }
        }
    }
}
