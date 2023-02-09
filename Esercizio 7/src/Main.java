package javabasics._8;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * <p>
     * Once this is converted to an int, increase its value by 2
     * <p>
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        String ourNumberStr = "88";
        int ourNumberInt = Integer.valueOf(ourNumberStr);
        ourNumberInt = ourNumberInt + 2;
        System.out.println(ourNumberInt);
        //Write your code here
    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     *     String.valueOf();
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2a:");
        char ourChar = 'a';
        String ourCharString = String.valueOf(ourChar);// <--- Change this line
        // Notice below what happens, the `charAt()` method
        System.out.println(ourCharString.toUpperCase().charAt(0));

        System.out.println("\nExercise 2b:");
        String anotherString = "Hello world";
        int charAtIndex = 6; // <--- Change this line
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String intStrToConvert = "5.5"; // Change this line
        System.out.println(Double.valueOf(intStrToConvert));

        String booleanStrToConvert = "maybe"; // And this line
        System.out.println(String.valueOf(booleanStrToConvert));

        String doubleStrToConvert = "true"; // Also this line
        System.out.println(Boolean.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     *    4.1: use a string method to make sure it can convert to an int and convert it to an int
     *    4.2: Times our number by 2
     *    4.3: Convert back to a string, and concatenate our number with itself,
     *         (i.e. 4 concatenated with itself is 44, not 8)
     *    4.4: Convert to a double and divide our number by 3.5
     *    4.5: Use Math.floor to remove decimal places on our number
     *
     *    Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String startStr = "5 ";
        // Write your code here
        int convertedStr = Integer.valueOf(startStr.trim());

        System.out.println(convertedStr);
        convertedStr = convertedStr*2;
        String newString = String.valueOf(convertedStr);
        newString = newString + newString;
        System.out.println(newString);

        double newDouble = Double.valueOf(newString);
        newDouble = newDouble / 3.5;

        System.out.println(Math.floor(newDouble));

    }
}