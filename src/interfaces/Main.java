package interfaces;

import interfaces.models.DataBaseLoader;
import interfaces.models.DataLoader;
import interfaces.models.DataRemover;
import interfaces.models.FileLoader;

public class Main {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

    }
}
