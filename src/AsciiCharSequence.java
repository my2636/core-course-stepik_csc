public class AsciiCharSequence implements CharSequence {
    private byte[] byteArray;

    public AsciiCharSequence(byte[] bArray) {
        this.byteArray = bArray;
    }

    @Override
    public int length() {
        return byteArray.length;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }
}
