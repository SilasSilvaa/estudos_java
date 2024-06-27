package generics.models;

public class Boat {
        private String name;

        public Boat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    '}';
        }

}
