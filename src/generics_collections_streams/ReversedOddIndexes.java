package generics_collections_streams;

import java.util.*;

public class ReversedOddIndexes {
    public static void main(String[] args) {
        try {
            String[] sArray = new Scanner(System.in).nextLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = sArray.length-1; i >= 0; i--) {
                if (i % 2 != 0) {
                    if (!sb.isEmpty() && i < sArray.length - 1) {
                        sb.append(" ");
                    }
                    sb.append(sArray[i]);
                }
            }
            System.out.println(sb);
        } catch (NoSuchElementException ignored) {}
    }
}

/*
String numbers = "1 2 3 31 1 4 5 61 4 5 6 99 7 8 4 9 5 6 7 5 6 5 6 7 8 4 9 7 8 4 9";
System.setIn(new ByteArrayInputStream(numbers.getBytes(StandardCharsets.UTF_8)));*/
