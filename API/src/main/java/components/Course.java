package components;

import java.util.ArrayList;

/**
 * <h1>Course class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;
    private Classroom classroom;

    /**
     * <h1>Creation of course</h1>
     * <h3>Object example</h3>
     * <pre>{@code Course course = new Course();}</pre>
     */
    public Course() {
        this.id = 0;
        this.name = "";
        this.teacher = null;
        this.students = new ArrayList<>();
        this.classroom = null;
    }

    /**
     * <h1>Creation of course</h1>
     * <h3>Object example</h3>
     * <pre>{@code Course course = new Course(1, "course", teacher, students, classroom);}</pre>
     * @param id Course id
     * @param name Course name
     * @param teacher Course teacher
     * @param students Course students
     * @param classroom Course classroom
     */
    public Course(int id, String name, Teacher teacher, ArrayList<Student> students, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.classroom = classroom;
        this.students = students;
    }

    /**
     * <h1>Set course id</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course();
     * course.setId(1);
     * }</pre>
     * @param id Set id for course
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * <h1>Get course id</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course(1, "course", teacher, students, classroom);
     * int id = course.getId();
     * }</pre>
     * @return returns id from course
     */
    public int getId() {
        return id;
    }

    /**
     * <h1>Set course name</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course();
     * course.setName("course");
     * }</pre>
     * @param name Set name for course
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <h1>Get course name</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course(1, "course", teacher, students, classroom);
     * String name = course.getName();
     * }</pre>
     * @return returns name from course
     */
    public String getName() {
        return name;
    }

    /**
     * <h1>Set course teacher</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course();
     * course.setTeacher(teacher);
     * }</pre>
     * @param teacher Set teacher for course
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * <h1>Get course teacher</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course(1, "course", teacher, students, classroom);
     * Teacher teacher = course.getTeacher();
     * }</pre>
     * @return returns teacher from course
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * <h1>Add students to course</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course();
     * course.addStudent(student);
     * }</pre>
     * @param student student for course
     */
    public void addStudent(Student student) {
        if (this.students.size() < this.classroom.getCapacity()) {
            this.students.add(student);
        } else {
            System.out.println("The classroom is full");
        }
    }

    /**
     * <h1>Get course students</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course(1, "course", teacher, students, classroom);
     * ArrayList<Student> students = course.getStudents();
     * }</pre>
     * @return returns students from course
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * <h1>Set course classroom</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course();
     * course.setClassroom(classroom);
     * }</pre>
     * @param classroom Set classroom for course
     */
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    /**
     * <h1>Get course classroom</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = new Course(1, "course", teacher, students, classroom);
     * Classroom classroom = course.getClassroom();
     * }</pre>
     * @return returns classroom from course
     */
    public Classroom getClassroom() {
        return classroom;
    }
}
