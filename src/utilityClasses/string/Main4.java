package utilityClasses.string;

public class Main4 {
    public static void main(String[] args) {
        String name = "Name";
        name.concat(" OtherName");
        System.out.println(name);

        StringBuilder sb = new StringBuilder("name");
        sb.append(" OtherName");
        sb.reverse();
        sb.delete(0, 2);
        System.out.println(sb);
    }
}
