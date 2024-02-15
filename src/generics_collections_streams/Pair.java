package generics_collections_streams;

import java.util.Objects;

class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
        System.out.println(i);
        System.out.println(s);
        System.out.println(pair.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println(pair.equals(pair2));
        System.out.println();

/*        Pair<Integer, String > pair3 = new Pair<>(null, null);
        Pair<Integer, String > pair4 = new Pair<>(null, null);
        Pair<Integer, String > pair5 = new Pair<>(4, null);
        Pair<Integer, String > pair6 = new Pair<>(4, null);
        Pair<Integer, String > pair7 = new Pair<>(null, "nu");
        Pair<Integer, String > pair8 = new Pair<>(null, "nu");
        System.out.println(pair5.equals(pair6)); // true
        System.out.println(pair7.equals(pair8)); // true
        System.out.println(pair3.equals(pair4)); // true
        System.out.println(pair5.equals(pair7)); // false
        System.out.println(pair8.equals(pair6)); // false
        System.out.println(pair.equals(pair7)); // false*/
    }
}

class Pair <T, X> {
    private final T first;
    private final X second;

    private Pair(T first, X second) {
        this.first = first;
        this.second = second;
    }

    T getFirst() { return first; }
    X getSecond() { return second; }



    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> other = (Pair<?, ?>) o;

        return  Objects.equals(first, other.first) && Objects.equals(second, other.second);
    }

    public int hashCode() {

        return Objects.hashCode(first) + Objects.hashCode(second);
    }

    public static <T, X> Pair<T, X> of(T tValue, X xValue) {
        return new Pair<>(tValue, xValue);
    }
}