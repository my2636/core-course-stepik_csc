package generics_collections_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.Collections.list;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("[^A-Za-zА-Яа-я0-9]+");
        List <String> l = List.of(s);
        List <String> list = new ArrayList<>(l);
        list.stream().distinct().sorted().map(x -> x.toLowerCase()).forEach(System.out::println);
    }
}

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
* */
