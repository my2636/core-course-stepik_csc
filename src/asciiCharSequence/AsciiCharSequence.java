package asciiCharSequence;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private final byte[] BYTEARRAY;

    public AsciiCharSequence(byte[] bArray) {
        this.BYTEARRAY = bArray;
    }

    @Override
    public int length() {
        return BYTEARRAY.length;
    }

    @Override
    public char charAt(int index) {

        return (char) BYTEARRAY[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(BYTEARRAY, start, end));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte byteArray : BYTEARRAY) {
            sb = sb.append((char) byteArray);
        }

        return sb.toString();
    }
}
