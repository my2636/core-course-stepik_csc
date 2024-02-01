package Ввод_вывод.sumOfRealNumbers;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double d = 0.0;
        while (sc.hasNext()) {
            try {
                d += Double.parseDouble(sc.next());
            } catch (Exception e) {
              if (!sc.hasNext()) {
                  break;
              }
            }
        }
        System.out.printf("%.6f", d);
    }
}