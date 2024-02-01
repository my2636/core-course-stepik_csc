package Базовый_синтаксис;

public class LeapYearCount {
    public static void main(String[] args) {
        leapYearCount(100);
    }
    public static int leapYearCount(int year) {
        int b = (year/4-year/100)+year/400;
        return b;
    }
}
