public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aB safab?`, a"));
    }
    static boolean isPalindrome(String text) {
        String newText = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(newText).reverse();
        String s = sb.toString();
        System.out.println(newText);
        System.out.println(s);
        return newText.equals(s);
    }
}
