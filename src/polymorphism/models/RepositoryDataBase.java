package polymorphism.models;

public class RepositoryDataBase implements Repository{
    @Override
    public void save() {
        System.out.println("Saving on database");
    }
}
