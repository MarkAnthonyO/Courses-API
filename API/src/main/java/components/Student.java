package components;

/**
 * <h1>Student class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 * @see Person
 */
public class Student extends Person {

    private int id;

    /**
     * <h1>Creation of student</h1>
     * <h3>Object example</h3>
     * <pre>{@code Student student = new Student(1, "student", "student-lastname", 1, "##########", "address");}</pre>
     * @param id id for student
     * @param name name for student
     * @param lastname lastname for student
     * @param age age for student
     * @param telephone telephone for student
     * @param address address for student
     */
    public Student(int id, String name, String lastname, int age, String telephone, String address) {
        super(name, lastname, age, telephone, address);
        this.id = id;
    }

    /**
     * <h1>Set student id</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Student student = new Student(1, "student", "student-lastname", 1, "##########", "address");
     * student.setId(1);
     * }</pre>
     * @param id Set id for student
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * <h1>Get student id</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Student student = new Student(1, "student", "student-lastname", 1, "##########", "address");
     * int id = student.getId();
     * }</pre>
     * @return id from student
     */
    public int getId() {
        return id;
    }
}
