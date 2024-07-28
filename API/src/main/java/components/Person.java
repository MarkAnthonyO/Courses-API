package components;

/**
 * <h1>Person base class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
abstract class Person {

    private String name;
    private String lastname;
    private int age;
    private String telephone;
    private String address;

    /**
     * <h1>Creation of person</h1>
     */
    protected Person(String name, String lastname, int age, String telephone, String address) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.telephone = telephone;
        this.address = address;
    }

    /**
     * <h1>Set name</h1>
     * @param name name for object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <h1>Get name</h1>
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * <h1>Set lastname</h1>
     * @param lastname lastname for object
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * <h1>Get lastname</h1>
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * <h1>Set lastname</h1>
     * @param age age for object
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * <h1>Get age</h1>
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * <h1>Set telephone</h1>
     * @param telephone telephone for object
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * <h1>Get telephone</h1>
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * <h1>Set address</h1>
     * @param address address for object
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <h1>Get address</h1>
     * @return address
     */
    public String getAddress() {
        return address;
    }
}
