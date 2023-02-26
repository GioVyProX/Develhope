package Ex3;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String sex;
    private String degree;
    private String surname;

    private int numberOfTimesYouGotADegree;


    public Student (int age){
        this.setAge(age);
    }

    public Student (String name){

        this.setName(name);
    }
    public Student (){

    }
//    public Student (String name, Integer age)
//    {
//        System.out.println("Constructing!");
//        this.setName(name);
//        this.setAge(age);
//        System.out.println("Constructed!");
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name = '" + getName() + '\'' +
//                ", age = " + getAge() +
//                '}';
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Invalid age");
        }else this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (Objects.equals(sex, "Male") || Objects.equals(sex, "Female")) {
            this.sex = sex;
        } else System.out.println("Sex not specified");
    }

    public String getDegree() {
        numberOfTimesYouGotADegree = numberOfTimesYouGotADegree + 1;
        if (degree != "") {
            return "You can access to classes ";
        }else return "You cannot access to classes =( ";


    }

    public void setDegree(String degree) {

        this.degree = degree;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    int getNumberOfTimesYouGotADegree(){

        return this.numberOfTimesYouGotADegree;
    }
}

