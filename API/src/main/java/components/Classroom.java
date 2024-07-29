package components;

/**
 * <h1>Classroom class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class Classroom {

    private int id;
    private String name;
    private int capacity;

    /**
     * <h1>Creation of classroom</h1>
     * <h3>Object example</h3>
     * <pre>{@code Classroom classroom = new Classroom(1, "classroom", 10);}</pre>
     * @param id Classroom id
     * @param name Classroom name
     * @param capacity Classroom capacity
     */
    public Classroom(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * <h1>Set classroom id</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Classroom classroom = new Classroom(0, "classroom", 10);
     * classroom.setId(1);
     * }</pre>
     * @param id id for classroom
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * <h1>Get classroom id</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Classroom classroom = new Classroom(1, "classroom", 10);
     * int id = classroom.getId();
     * }</pre>
     * @return returns id from classroom
     */
    public int getId() {
        return id;
    }

    /**
     * <h1>Set classroom name</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Classroom classroom = new Classroom(1, "", 10);
     * classroom.setName("classroom");
     * }</pre>
     * @param name name for classroom
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <h1>Get classroom name</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Classroom classroom = new Classroom(1, "classroom", 10);
     * String name = classroom.getName();
     * }</pre>
     * @return returns name from classroom
     */
    public String getName() {
        return name;
    }

    /**
     * <h1>Set classroom capacity</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Classroom classroom = new Classroom(1, "classroom", 0);
     * classroom.setCapacity(10);
     * }</pre>
     * @param capacity capacity for classroom
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * <h1>Get classroom capacity</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Classroom classroom = new Classroom(1, "classroom", 10);
     * int capacity = classroom.getCapacity();
     * }</pre>
     * @return returns capacity from classroom
     */
    public int getCapacity() {
        return capacity;
    }
}
