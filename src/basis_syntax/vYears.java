package basis_syntax;/*В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.

        Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года включительно.
        На самом деле Григорианский календарь был введен значительно позже, но здесь для упрощения мы распространяем его действие на всю нашу эру.*/

public class vYears {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.3, 0.5, 0.8));
    }
    public static boolean doubleExpression(double a, double b, double c) {
        return a + b == c;
    }
}
