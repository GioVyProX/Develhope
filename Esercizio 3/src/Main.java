package javabasics._4;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int age = 19;
        System.out.println("My age is " + age );

    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        int age = 19;
        char firstLetter= 'G';
        System.out.println("My age is " + age +", my initial letter is " + firstLetter);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
//create a boolean variable which report false or true, based on if you have eaten or not
        boolean hasEatenLunch = false;
//store the cost of lunch in a appropriate variable
        double lunchCost = 5.99;
//print the lunch cost and the bool has eaten
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}