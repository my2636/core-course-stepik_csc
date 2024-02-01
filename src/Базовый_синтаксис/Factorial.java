package Базовый_синтаксис;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static BigInteger factorial(int value) {
        BigInteger result = new BigInteger("1");
        for (int i=1; i<=value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
