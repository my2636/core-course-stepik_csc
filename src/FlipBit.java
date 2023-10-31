public class FlipBit {
    public static void main(String[] args) {
        flipBit(180, 6);
    }
    static int flipBit(int value, int bitIndex) {
        int v0 = 1<<(bitIndex-1);
        int v1 = value ^ v0;
        System.out.println(Integer.toBinaryString(value));
        System.out.println(Integer.toBinaryString(v0));
        System.out.println(Integer.toBinaryString(v1));
        System.out.println(Integer.toBinaryString(1024));
        return v1;
    }
}