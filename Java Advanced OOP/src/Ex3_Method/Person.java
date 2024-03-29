package Ex3_Method;

public class Person {

    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Name: " + name + " - Age: " + age + " - Address: " + address;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(age) + address.hashCode();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
