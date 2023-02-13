import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

      /*      System.out.println("\nExercise 3:");

            double myLunchPrice = 5.99;
            String lunchType = "sandwich";
            String description = "Nice big sandwich";
            int weightInGrams = 500;

             Call your function
       */

        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("yellow");

        String a;


        System.out.println("Write the colour you wanna remove");
        Scanner var = new Scanner(System.in);
        a = var.nextLine();

        colors.remove(a);

        System.out.println(colors);

        }


    }

