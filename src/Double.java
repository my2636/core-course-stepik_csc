public class Double {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }
    static boolean doubleExpression(double a, double b, double c) {
        boolean result = Math.abs((a+b)-c)<= 0.0001? true : false;
        return result;
    }
}
