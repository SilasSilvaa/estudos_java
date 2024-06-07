package exercise.models;

public class Seminar {
    private String title;
    private Local local;
    private Student[] students;

    public Seminar(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public Seminar(String title, Local local, Student[] students){
        this.title = title;
        this.local = local;
        this.students = students;
    }

    public void print(){
        System.out.println("Title: " + this.title);
        System.out.println("Local: " + this.local.getAddress());

        if(this.students != null){
            System.out.println("Students:");
            for(Student student : students){
                System.out.println("Student: " + student.getName());
            }
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
