package exception;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
//        Null pointer exception
//        Object object = null;
//        System.out.println(object);

//        Array Index out of bounds exception
//        int[] nums = {1, 2};
//        System.out.println(nums[3]);

//        Checked exception
        createFile();

//        UncheckedException
        try {
            divide(1, 0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
    //Checked exception
    private static void createFile(){
        File file = new File("files\\test.txt");
//        Logger logger = Logger.getLogger(File.class.getName());

        try {
            boolean isCreated = file.createNewFile();

            System.out.println("File created " + isCreated);
        }catch (IOException e) {
//            logger.log(Level.WARNING, "Error", e);
//            System.out.println(e);
            e.printStackTrace();
        }
    }

    //Unchecked exception
    private static int divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Illegal argument exception");
        }
        return a / b;
//        try {
//            return a / b;
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }
    }
}
