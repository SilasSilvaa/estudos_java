package interfaces.models;

public interface DataLoader {
    void load();

    //Changes the method to optional
    default void checkPermission(){
        System.out.println("Checking permission...");
    }


}
