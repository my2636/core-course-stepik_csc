package basis_syntax;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2));
    }
    public static boolean isPowerOfTwo(int value) {
        boolean result = false;
        int v0 = Math.abs(value);
        int v = Integer.bitCount(v0);
        if (v>1) {
            result = false;
        } else if (v==1) {
            result = true;
        }

        return result;
    }
}
