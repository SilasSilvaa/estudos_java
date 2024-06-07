package utilityClasses.string;

public class Main2 {
    public static void main(String[] args) {
        String name = "Luffy";
        String Name = "              Luffy";
        String numbers = "012345";

        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.replace("L", "R"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.substring(0, 2));
        System.out.println(numbers.substring(3));
        System.out.println(name.trim());
    }
}
