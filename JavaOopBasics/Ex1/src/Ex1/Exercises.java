package Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise2();
        exercise3();
    }

    /**
     * 1: Create a new Class in this package
     *
     *    Call this class 'Ex1.Course'
     *
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *
     *    On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called 'Ex1.Student', add variables
     * (class variables are called 'fields' or 'attributes')
     * called 'name' and 'age'
     * <p>
     * Using the function below set the student name and ages
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> users = new ArrayList<>();

        for (int i = 0; i < studentAges.size(); i++) {

            Student user = createNewStudent(studentNames.get(i), studentAges.get(i));

            users.add(user);

        }
        System.out.println(users);
        // Use a for i loop
    }

    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();

        student.name = name;
        student.age = age;

        // Write your code here
        return student;
    }

    /*
     * 3: Finally lets edit our 'Ex1.Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Ex1.Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        Course javaCourse = new Course();

        javaCourse.name = "Java";
        javaCourse.maxStudents = 20;
        javaCourse.qualityRatingOutOf10 = 7;

        List<Student> users = new ArrayList<>();

        for (int i = 0; i < studentAges.size(); i++) {
            Student user = createNewStudent(studentNames.get(i), studentAges.get(i));
            users.add(user);
        }
        javaCourse.students = users;


        System.out.println(Course.staticAverageAgeAmongStudents(javaCourse.students));

        System.out.println(javaCourse.avarageAmongStudents());

        System.out.println(javaCourse);
//        double sum = 0;
//
//        double avarage1 = (course.age1 + course.age2 + course.age3)/studentAges.size();
//        System.out.println(avarage1);
//
//        for (int i = 0; i < studentAges.size(); i++) {
//
//            sum = studentAges.get(i) + sum;
//
//        }
//        double avarage = sum/studentAges.size();
//        System.out.println(avarage);

        // Write your code here
    }
}
