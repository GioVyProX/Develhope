package javabasics._17;

import java.time.LocalDate;
import java.time.Month;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;
        Long.parseLong(String.valueOf(myBankBalanceEuro));
        long newBalance = myBankBalanceEuro + questionableFundsEuro;
        System.out.println(newBalance);
        //Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age   --> byte
     *    2b: The age of a baby in months --> byte
     *    2c: Money in a hedgefund in euros --> if you want to count only euros int should be okay,
     *    if you want to count cents as well you have to use float
     *    2d: Price of a good in euros on amazon.com --> int, maybe also short (I do not think there are items with
     *    a cost over 32k)
     *    2e: The exact weight of an apple measured by scientific equipment --> double, float should be okay as well
     *    2f: The number of kilometers from any 2 places in the world --> short (the maximum range is 15k)
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {

        System.out.println("Exercise 3:");

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().getDayOfMonth());

        System.out.println(LocalDate.now().getDayOfYear());

        Month month = LocalDate.now().getMonth();
        String week = String.valueOf(LocalDate.now().getDayOfWeek());

        String year = String.valueOf (LocalDate.of(2023, 10, 18));
        if (parseInt(year) > parseInt(String.valueOf(LocalDate.now()))){

            System.out.println("Siamo nel passato ");
        }else System.out.println("Sei nel presente");

        System.out.println(String.valueOf(month).toLowerCase());
        System.out.println(week.toLowerCase().strip().substring(0,3));

    }
}
