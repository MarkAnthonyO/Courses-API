package Components;

import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private final ArrayList<Student> student;
    private Classroom classroom;

    public Course(int id, String name, Teacher teacher, ArrayList<Student> student, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.classroom = classroom;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return student;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        if (this.student.size() < this.classroom.getCapacity()) {
            this.student.add(student);
        } else {
            System.out.println("The classroom is full");
        }
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
