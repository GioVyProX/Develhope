package Ex2;

public class Student {

    String name;
    int age;


    public Student (int age){

        this.age = age;
    }

    public Student (String name){

        this.name = name;
    }
    public Student (){

    }
    public Student (String name, Integer age)
    {
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
