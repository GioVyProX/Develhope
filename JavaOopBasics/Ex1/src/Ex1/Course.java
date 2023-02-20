package Ex1;

import java.util.Arrays;
import java.util.List;

public class Course {

    String name;
    int maxStudents;
    byte qualityRatingOutOf10;

    List<Student> students;


    public static double staticAverageAgeAmongStudents(List<Student>students) {

       double sum = 0;

       for (int i = 0; i < students.size(); i++) {

          sum = students.get(i).age + sum;

       }
       double average = sum / students.size();

       return average;
    }

    public double avarageAmongStudents() {

        double sum = 0;

        for (int i = 0; i < students.size(); i++) {

            sum = students.get(i).age + sum;

        }
        double average = sum / students.size();

        return average;
    }

   @Override
   public String toString() {
      return name + " " + maxStudents + " " + qualityRatingOutOf10;
   }

   //
//
//     Student user1 = createNewStudent(studentNames.get(0), studentAges.get(0));
//     Student user2 = createNewStudent(studentNames.get(1), studentAges.get(1));
//     Student user3 = createNewStudent(studentNames.get(2), studentAges.get(2));
//
//     double age1 = user1.age;
//     double age2 = user2.age;
//     double age3 = user3.age;
//
//
//   public static Student createNewStudent(String name, Integer age) {
//      Student student = new Student();
//
//      student.name = name;
//      student.age = age;
//
//      // Write your code here
//      return student;
    // }


}
