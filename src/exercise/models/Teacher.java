package exercise.models;

public class Teacher {
    private String name;
    private String specialist;
    private Seminar[] seminars;

    public Teacher(String name, String specialist) {
        this.name = name;
        this.specialist = specialist;
    }

    public Teacher(String name, String specialist, Seminar[] seminars){
        this.name = name;
        this.specialist = specialist;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("---------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Specialist: " + this.specialist);

        if(seminars != null){
            for(Seminar seminar : this.seminars){
                System.out.println("Seminar:");
                System.out.println("Title: " + seminar.getTitle());
                System.out.println("Local: " + seminar.getLocal().getAddress());

                if(seminar.getStudents() != null){
                    System.out.println("Students: ");
                    for(Student student : seminar.getStudents()){
                        System.out.println("Student: " + student.getName());
                    }
                }
                System.out.println("---------------------------");
            }
        }
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
