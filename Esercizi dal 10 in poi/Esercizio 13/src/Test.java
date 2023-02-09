import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nExercise 2:");
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;
        for (Integer item:items) {
            maxNumber = Math.max(item, maxNumber);

            minNumber = Math.min(item, minNumber);
        }
        System.out.println("The max is " + maxNumber);
        System.out.println("The max is " + minNumber);


    }
}
