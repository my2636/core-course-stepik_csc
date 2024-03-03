package generics_collections_streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class FindingMinMax {
    public static void main(String[] args) {
        findMinMax(Stream.of(11, 22, 33, 44, 55, 66),
                Integer::compareTo,
                (x1, x2) -> System.out.println("got min value " + x1 + " and max value " + x2));

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<? extends T> list = stream.toList();

        if (list.isEmpty()) minMaxConsumer.accept(null, null);
        else {
            minMaxConsumer.accept(list.stream().min(order).get(), list.stream().max(order).get());
        }
    }
}
