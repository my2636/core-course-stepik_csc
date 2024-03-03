package generics_collections_streams;

import java.util.stream.IntStream;

public class PseudoRandomStream {
    public static void main(String[] args) {
        int a = 13;

        pseudoRandomStream(a);
    }

    public static IntStream pseudoRandomStream(int seed) {
/*
        IntStream.iterate(seed, x -> (((x * x) / 10)) % 1000 ).forEach(System.out::println);
*/
        return  IntStream.iterate(seed, x -> (((x * x) / 10)) % 1000 );
    }
}
