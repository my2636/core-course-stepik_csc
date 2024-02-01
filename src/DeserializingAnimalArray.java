import java.io.Serializable;
import java.util.Objects;

public class DeserializingAnimalArray {
    public static void main(String[] args) {

    }

    class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }
    public static Animal[] deserializeAnimalArray(byte[] data) {
        // your implementation here
        return null;
    }
}
