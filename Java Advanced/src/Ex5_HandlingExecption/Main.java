package Ex5_HandlingExecption;

import com.sun.source.tree.VariableTree;
import jdk.jfr.StackTrace;

import javax.lang.model.type.PrimitiveType;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import java.io.IOException;
import java.nio.file.*;
import java.sql.*;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints its stack trace
     */
    private static void exercise1()  {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException ioException){

            System.out.println("Stack trace");
            ioException.printStackTrace();
        }
        }


    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here


        try {
            String userInputFileName = "test-file.txt";
            Files.createFile(Path.of(userInputFileName));
        } catch (IOException e) {
            System.out.println("File could not be found");
//            throw new RuntimeException(e);
        }


    }

    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        try {
            Integer.parseInt("house");

        }catch (NumberFormatException e){
            System.out.println("Input is not a valid integer");
        }
        }

    /**
     * 4:
     *
     * Write a try block that around this print statement that attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        int num1 = 10;
        String num2AsString = "0.0";
         try{
        System.out.println(num1/Integer.parseInt(num2AsString));
        } catch (NumberFormatException e){
             System.out.println("Number is invalid");
         }
         catch (ArithmeticException e){
             System.out.println("Can't divide a number by zero");
         }
    }
}


