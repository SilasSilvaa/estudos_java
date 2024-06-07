package exception;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try {
            createFile();
            createFile2();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Checked exception
    //Using try/catch for methods private and throws exception for public methods
    private static void createFile() throws IOException {
        File file = new File("files\\test1.txt");
        boolean isCreated = file.createNewFile();
        System.out.println("File created " + isCreated);

    }
    private static void createFile2() throws IOException {
        File file = new File("files\\test2.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created " + isCreated);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }

    }
}
