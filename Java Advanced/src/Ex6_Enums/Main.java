package Ex6_Enums;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
            System.out.println(Arrays.toString(Days.values()));
        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);
        System.out.println(Days.WEDNESDAY);
        System.out.println(Days.THURSDAY);
        System.out.println(Days.FRIDAY);
        System.out.println(Days.SATURDAY);
        System.out.println(Days.SUNDAY);


    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here


        System.out.println("Enter the season");
        Scanner scanner = new Scanner(System.in);
        Seasons spring = Seasons.valueOf(scanner.nextLine().toUpperCase());

        switch (spring) {
            case SPRING -> System.out.println("March, April, May ");
            case SUMMER -> System.out.println("June, July, August");
            case FALL -> System.out.println("September, October, November");
            case WINTER -> System.out.println("December, January, February");
            default -> System.out.println("Nothing");
        }
    }


    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        enum TrafficLight {RED, YELLOW, GREEN}

        System.out.println("Enter TrafficLight");
        Scanner scanner = new Scanner(System.in);
        TrafficLight trafficLight = TrafficLight.valueOf(scanner.nextLine().toUpperCase());
        switch (trafficLight){

            case RED -> System.out.println("Next is Green");
            case GREEN -> System.out.println("Next is Yellow");
            case YELLOW -> System.out.println("Next is Red");
        }
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        System.out.println("Enter the day ");
        Scanner scanner = new Scanner(System.in);
        Days input = Days.valueOf(scanner.nextLine().toUpperCase());

        if (input == Days.SATURDAY || input == Days.SUNDAY){
            System.out.println("Is weekend");
        }else System.out.println("Is not weekend");

    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        enum Operator { ADD, SUBTRACT, MULTIPLY, DIVIDE }
        System.out.println("Enter the operator");

        Scanner scanner = new Scanner(System.in);
        Operator input = Operator.valueOf(scanner.nextLine());

        double num1 = 5;
        double num2 = 2;
        switch (input){
            case ADD -> System.out.println("The sum is " + (num1 + num2));
            case DIVIDE -> System.out.println("The division is " + (num1/num2));
            case MULTIPLY -> System.out.println("The multiplication is " + (num1*num2));
            case SUBTRACT -> System.out.println("The sottraction! is " + (num1-num2));
        }
    }

}

