package utilityClasses.string;

public class Main {
    public static void main(String[] args) {
        // String are immutables
        String name = "Name"; // String constant pool
        String name2 = "Name";
        System.out.println(name == name2);

        name = name.concat(" Name");
        System.out.println(name == name2);

        String name3 = new String("Name");
        System.out.println(name2 == name3.intern());

    }
}
