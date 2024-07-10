package Components;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private String telephone;
    private String address;

    public Person(String name, String lastname, int age, String telephone, String address) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.telephone = telephone;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
