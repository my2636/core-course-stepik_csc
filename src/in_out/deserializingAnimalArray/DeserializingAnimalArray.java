package in_out.deserializingAnimalArray;

import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;

public class DeserializingAnimalArray {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = Paths.get("zver.txt").toFile();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeInt(3);
        oos.writeObject(new Animal("zver"));
        oos.writeObject(new Animal("zver1"));
        oos.writeObject(new Animal("zver2"));
        oos.close();

        FileInputStream fis = new FileInputStream("zver.txt");
        byte[] bytes = new byte[fis.available()];
/*
        byte[] empty = null;
*/
        fis.read(bytes);
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(deserializeAnimalArray(bytes)));
    }

/*    public static in_out.deserializingAnimalArray.Animal[] deserializeAnimalArray(byte[] data) throws IOException, ClassNotFoundException {
        in_out.deserializingAnimalArray.Animal[] a = null;
        try(ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int readed = ois.readInt();
            for (int i = 0; i < readed; i++) {
                a[i] = (in_out.deserializingAnimalArray.Animal) ois.readObject();
            }
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("");
        } catch (IOException e) {
            throw new IllegalArgumentException("");
        } return a;
    }*/

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try  (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int amount = ois.readInt();
            Animal[] animals = new Animal[amount];
            for (int i = 0; i < amount; i++) {
                animals[i] = (Animal) ois.readObject();
            }
            return animals;
        } catch (Exception e) {
            throw new IllegalArgumentException("(");
        }
    }
}

/*
* Реализуйте метод, который из переданного массива байт восстановит массив объектов in_out.deserializingAnimalArray.Animal.
* Массив байт устроен следующим образом. Сначала идет число типа int, записанное при помощи
* ObjectOutputStream.writeInt(size). Далее подряд записано указанное количество объектов типа in_out.deserializingAnimalArray.Animal,
* сериализованных при помощи ObjectOutputStream.writeObject(animal).

Если вдруг массив байт не является корректным представлением массива экземпляров in_out.deserializingAnimalArray.Animal,
* то метод должен бросить исключение java.lang.IllegalArgumentException.

Причины некорректности могут быть разные. Попробуйте подать на вход методу разные
* некорректные данные и посмотрите, какие исключения будут возникать. Вот их-то и
* нужно превратить в IllegalArgumentException и выбросить. Если что-то забудете, то
* проверяющая система подскажет. Главное не глотать никаких исключений, т.е. не оставлять нигде пустой catch.
*
* */
