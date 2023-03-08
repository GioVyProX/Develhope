package Ex4_File;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

        private static final Path MY_PATH = Paths.get("file.txt");
        private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

        public static void main(String[] args) {
            exercise1();
            exercise2();
            exercise3();
            exercise4();
            exercise5();
        }

        // Use the MY_PATH constant

        /**
         * 1:
         * Write a method that writes myString to a file
         * writes to a file
         */
        private static void exercise1() {
            System.out.println("Exercise 1: ");
            String myString = """
                Tua mamma è mia <3
                """;

            try {
//                Files.createFile(MY_PATH);

//                Files.writeString(MY_PATH, myString);

                // Your code here
            } catch (Exception exception) {
                System.err.println("There was an error!");
                exception.printStackTrace();
                System.exit(0);
            }
        }

        /**
         * 2:
         * Write a method that reads the file from exercise 1
         * then prints it out
         */
        private static void exercise2() {
            System.out.println("\nExercise 2: ");
            try {

                System.out.println(Files.readString(MY_PATH));

                // Your code here
            } catch (Exception exception) {
                System.err.println("There was an error!");
                exception.printStackTrace();
                System.exit(0);
            }


        }

        /**
         * 3:
         * Write a method that reads a file and print the number of lines in the file
         */
        private static void exercise3() {
            System.out.println("\nExercise 3: ");
            // Write code here to read the file and return the number of lines "\n", string.split

            try {
                int numberOfLines = 0;
                String leggiFile = Files.readString(MY_PATH);

                String [] stringheNelFile = leggiFile.split("\n");

                for (String stringa: stringheNelFile) {
                    numberOfLines++;
                }
                System.out.println(numberOfLines);

                // Your code here
            } catch (Exception exception) {
                System.err.println("There was an error!");
                exception.printStackTrace();
                System.exit(0);
            }
        }

        /**
         * 4:
         * Write a method that reads a file and returns the number of words in the file
         *
         * Then deletes the previous file with Files.delete() use inside the try block
         *
         */
        private static void exercise4() {
            System.out.println("\nExercise 4: ");
            try {
                int numberOfWords = 0;
                String [] leggiFile = Files.readString(MY_PATH).split(" ");

                for (String parola : leggiFile) {

                    numberOfWords++;

                    // Your code here
                }
                System.out.println(numberOfWords);

                Files.delete(MY_PATH);
            } catch (Exception exception) {
                System.err.println("There was an error!");
                exception.printStackTrace();
                System.exit(0);
            }
        }

            /**
         * 5:
         * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
         */
        private static void exercise5() {
            System.out.println("\nExercise 5: ");
            Path myDirectoryPath = Path.of("mydirectory");

            try {
                Files.createDirectories(myDirectoryPath);
                // Your code
                Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");

            } catch (Exception exception) {
                System.err.println("There was an error!");
                exception.printStackTrace();
                System.exit(0);
            }
        }
    }
