package composition;

public class Student extends Address {

    private String name;
    private int age;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        super(streetAddress, zipCode, state, phone);
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
