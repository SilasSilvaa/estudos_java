package exception;

public class Main3 {
    public static void main(String[] args) {
        openConnection();
    }

    private static String openConnection() {
        try {
            System.out.println("Opening file");
            System.out.println("Read file");
            return "Open connection";
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Closing resource");
        }
        return null;
    }
}
