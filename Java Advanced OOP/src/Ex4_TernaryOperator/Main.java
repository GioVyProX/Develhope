package Ex4_TernaryOperator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        double x = Math.random()*100;
        String s = x >= 50 ? "x is greater than 50" : "x is less than 50";
        System.out.println(s);
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person = new Person("Giovanni", 19, "Non te lo dico");

        System.out.println(person.name());
        System.out.println(person.age());
        System.out.println(person.address());
        System.out.println(person);
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() throws ArithmeticException{
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigInteger = new BigInteger("23721897328913218793127893781932178923718973218");
        BigDecimal bigDecimal = new BigDecimal("218393.32132189321");

        BigInteger newBigInteger = bigInteger.divide(new BigInteger("3"));
        System.out.println(newBigInteger);
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal newBigDecimal = bigDecimal.divide(pi, MathContext.DECIMAL128);

        System.out.println(newBigDecimal);
    }
}
