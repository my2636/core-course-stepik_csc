import java.util.function.DoubleUnaryOperator;

public class Integrate  {

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1,0, 10));
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double n = 10000000;
        double h = Math.abs(b - a) / n;
        double result = 0;
        //f = (s) -> Math.sin(s);

        for(int i = 0; i < n; i++) {
            result +=  f.applyAsDouble(a + h * i);
        }

        return result *= h;
    }
}



