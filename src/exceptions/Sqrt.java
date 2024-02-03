package exceptions;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt( 3.6));
    }

    public static double sqrt(double x) throws IllegalArgumentException {
        if (x < 0){
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }
}
