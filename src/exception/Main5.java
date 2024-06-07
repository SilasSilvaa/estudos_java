package exception;

import exception.models.File;

import java.io.IOException;

public class Main5 {
    public static void main(String[] args) {

    }

    public static void readFile(){
        // Try with resources | required using Closable or AutoClosable
        try(File file = new File()) {
            System.out.println(" ");
        }catch (IOException e){
            System.out.println(" ");
        }
    }
}
