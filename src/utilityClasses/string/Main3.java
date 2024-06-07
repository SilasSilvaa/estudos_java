package utilityClasses.string;

public class Main3 {
    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();
        concatString(100_000);
        long finalTime = System.currentTimeMillis();

        System.out.println("Time: " + (finalTime - initialTime) + "ms");
    }

    public static void concatString(int number){
        String text = "";

        for(int i = 0; i < number; i++){
            text += i;
        }
    }
}
