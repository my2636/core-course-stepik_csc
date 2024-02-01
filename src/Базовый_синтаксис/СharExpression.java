package Базовый_синтаксис;

public class СharExpression {
    public static void main(String[] args) {
        charExpression(8);
    }
    static char charExpression(int a) {
        char ch0 =  '\\';
        char ch1 = (char)(ch0 + a);
        return ch1;
    }
}
