package generics_collections_streams;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Arrays.stream(new Scanner(System.in).nextLine().split("[^A-Za-zА-Яа-я0-9]+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long> comparingByValue().reversed().thenComparing(Map.Entry::getKey))
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }
}

/*consectetur
faucibus
ipsum
lorem
adipiscing
amet
dolor
eget
elit
mi*/


/*        Scanner sc1 = new Scanner(System.in);
        String[] s = sc1.nextLine().split("[^A-Za-zА-Яа-я0-9]+");
        List <String> l = List.of(s);
        List <String> list = new ArrayList<>(l);
        list.stream()
                .distinct()
                .sorted().
                map(x -> x.toLowerCase())
                .forEach(System.out::println);*/


/*
Напишите программу,
-читающую из System.in текст в кодировке UTF-8,
-подсчитывающую в нем частоту появления слов,
-в конце выводящую 10 наиболее часто встречающихся слов.

Слово - непрерывная последовательность символов только из букв и цифр.
В строке "Мама мыла раму 33 раза!" ровно пять слов:
"Мама", "мыла", "раму", "33" и "раза".

-Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово. Выводите слова в нижнем регистре.
-Если в тексте меньше 10 уникальных слов, то выводите сколько есть.
-Если в тексте некоторые слова имеют одинаковую частоту (их нельзя однозначно упорядочить только по частоте) -
то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.

Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.

Sample Input 1:
Мама мыла-мыла-мыла раму!
Sample Output 1:
мыла
мама
раму
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.
* */
