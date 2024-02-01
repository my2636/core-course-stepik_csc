package Базовый_синтаксис;

public class BooleanExpression {
    public static void main(String[] args) {
        booleanExpression(false, false, false, false);
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean[] bool = {a, b, c, d};
        int count = 0;
        boolean bo = true;
        for(int i=0; i<bool.length;i++) {
            if(bool[i]==true) {
                count++;
                System.out.println(count);
            }
        }
        if(count!=2) {
            bo = false;
        }
        return bo;
    }
}
