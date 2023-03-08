package Ex3_Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
     *
     *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        Set<String> setList = new HashSet<>(list);

        list = new ArrayList<>(setList);


        // Your code here

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
         toSet(list);
        System.out.println("\nnow set");
         toSet(set);
    }

    private static void toSet (Collection<String> names){

        for (String name: names) {
            System.out.print(" - " + name);
        }
    }
    // Write your method for exercise 2 here


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();
        System.out.println();


        for (String word: words) {
            int number = 0;
            for (String parola: words ) {

                if (Objects.equals(parola.strip(), word.strip())){
                    number = number + 1;
                }
            }
            wordCount.put(word, number);
        }
        System.out.println(wordCount);

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer:    I will use a map to store the day of their arrival as key, using a treeMap that makes it ordered
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: hashmap because you don't want to order by grades
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: It isn't clear enough what you are asking for, but I guess TreeMap would be perfect for ordering the name of countries in order of age
     *    If you want to order only age, you can use a treeSet
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer:   Names and prices storing requires an HashMap, so you can store the product with name as keyword and price as value
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: you should use a hashset
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: hashmap
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: hasmap or TreeMap if you want to order them by dates
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: hashmap
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: hasmap or TreeMap if you want to order them by dates
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:   hashmap
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: hasmap or TreeMap if you want to order them by dates
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: hashmap always
     */

}
