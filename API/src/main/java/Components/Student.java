package Components;

public class Student extends Person {
    private int id;

    public Student(int id, String name, String lastname, int age, String telephone, String address) {
        super(name, lastname, age, telephone, address);
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
