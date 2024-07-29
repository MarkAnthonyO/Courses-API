package components;

/**
 * <h1>Teacher class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 * @see Person
 */
public class Teacher extends Person {

    private int id;

    /**
     * <h1>Creation of student</h1>
     * <h3>Object example</h3>
     * <pre>{@code Teacher teacher = new Teacher(1, "teacher", "teacher-lastname", 1, "##########", "address");}</pre>
     * @param id id for teacher
     * @param name name for teacher
     * @param lastname lastname for teacher
     * @param age age for teacher
     * @param telephone telephone for teacher
     * @param address address for teacher
     */
    public Teacher(int id, String name, String lastname, int age, String telephone, String address) {
        super(name, lastname, age, telephone, address);
        this.id = id;
    }

    /**
     * <h1>Set teacher id</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Teacher teacher = new Teacher(1, "teacher", "teacher-lastname", 1, "##########", "address");
     * teacher.setId(1);
     * }</pre>
     * @param id Set id for teacher
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * <h1>Get teacher id</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Teacher teacher = new Teacher(1, "teacher", "teacher-lastname", 1, "##########", "address");
     * int id = teacher.getId();
     * }</pre>
     * @return id from teacher
     */
    public int getId() {
        return id;
    }
}
