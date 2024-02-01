package Объекты_классы_пакеты.asciiCharSequence;

public class UseClass {
    public static void main(String[] args) {
        CharSequence asciiCharSequence = new AsciiCharSequence(new byte[]{1, 5, 7, 115, 116, 14, 116});

        System.out.println(asciiCharSequence.charAt(3));
        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.subSequence(2, 5));
        System.out.println(asciiCharSequence);

    }
}
