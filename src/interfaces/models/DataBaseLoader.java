package interfaces.models;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Loading database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing from database...");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }
}
