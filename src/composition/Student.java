package composition;

public class Student {

    private String name;
    private int age;
    private Address address;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.address = new Address(streetAddress, zipCode, state, phone);  // Create Address instance
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
    // Delegate to Address:
    public String getPhone() {
        return address.getPhone();
    }

    public void setPhone(String phone) {
        address.setPhone(phone);
    }

    public String getState() {
        return address.getState();
    }

    public void setState(String state) {
        address.setState(state);
    }

    public String getStreetAddress() {
        return address.getStreetAddress();
    }

    public void setStreetAddress(String streetAddress) {
        address.setStreetAddress(streetAddress);
    }

    public int getZipCode() {
        return address.getZipCode();
    }

    public void setZipCode(int zipCode) {
        address.setZipCode(zipCode);
    }
}
