package exercise;

import exercise.models.Local;
import exercise.models.Seminar;
import exercise.models.Student;
import exercise.models.Teacher;

public class Main {
    public static void main(String[] args) {
        Local local1 = new Local("Rua churusbandgo 123");
        Local local2 = new Local("Rua churusbandgo 321");

        Seminar seminar1 = new Seminar("Seminar 1", local1);
        Seminar seminar2 = new Seminar("Seminar 2", local2);

        Seminar[] seminars = {seminar1, seminar2};

        Teacher teacher = new Teacher("Teacher 1", "Technology", seminars);

        Student student1 = new Student("Student A", 22, seminar1);
        Student student2 = new Student("Student B", 20, seminar2);
        Student student3 = new Student("Student C", 24, seminar2);

        seminar1.setStudents(new Student[]{student1});

        Student[] students = {student2, student3};
        seminar2.setStudents(students);
        student2.setSeminar(seminar2);
        student3.setSeminar(seminar2);

        student1.print();
        System.out.println("-----------");
        seminar2.print();
        teacher.print();
    }
}
