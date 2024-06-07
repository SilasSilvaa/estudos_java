package polymorphism.models;

public class RepositoryFile implements Repository{
    @Override
    public void save() {
        System.out.println("Saving file");
    }
}
