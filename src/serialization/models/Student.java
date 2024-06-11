package serialization.models;

import java.io.*;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 8923443944557978424L;

    private long id;
    private String name;
    private transient String password;
    private static final String SCHOOL_NAME = "Test";
    private transient Group group;

    public Student(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();
            oos.writeUTF(group.getName());

        }catch (IOException e ){
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            String groupName = ois.readUTF();
            group = new Group(groupName);
        }catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", Group='" + group + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
