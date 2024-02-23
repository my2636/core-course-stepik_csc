package generics_collections_streams;

import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>(Arrays.asList(0, 1, 2));
/*        Set<Integer> firstSet = new LinkedHashSet<>();
        firstSet.add(3);
        firstSet.add(7);
        firstSet.add(9);*/

        Set<Integer> secondSet = new HashSet<>(Arrays.asList(1, 2, 3));

/*        Set<Integer> secondSet = new LinkedHashSet<>();
        secondSet.add(5);
        secondSet.add(7);
        secondSet.add(12);*/

        System.out.println(symmetricDifference(firstSet,secondSet));
    }


    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> differenceSet = new HashSet<>(set1);
        differenceSet.addAll(set2);
        Set<T> difference = new HashSet<>(set1);
        difference.retainAll(set2);
        differenceSet.removeAll(difference);
        return differenceSet;
    }
}


        /*for (T set1Element : set1) {
            if (!set2.contains(set1Element)) {
                differenceSet.add(set1Element);
            }
            for (T set2Element : set2) {
                if (!set1.contains(set2Element)) {
                    differenceSet.add(set2Element);
                }
            }
        }*/

/*

Реализуйте метод, вычисляющий симметрическую разность двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

Пример

Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
*/