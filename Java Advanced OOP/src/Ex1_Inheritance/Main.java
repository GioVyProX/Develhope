package Ex1_Inheritance;

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
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog = new Dog(0.75, 50.23, "Cane Legendario fratm");
        System.out.println(dog);
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Bird bir = new Bird(0.50, 23.1, 23);
        System.out.println(bir);
        Fish fish = new Fish(0.30, 10.3, "Clownfish");
        System.out.println(fish);
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog = new Dog(0.23, 32.3, "Gennappa");
        Fish fish = new Fish(0.45, 23.9, "PescePalle");
        Bird bird = new Bird(0.15, 20.5, 19.3);
        double maxSpeed = 0;

        double a = Math.max(dog.runSpeedMetersPerSecond(),fish.swimSpeedMetersPerSecond());
        System.out.println(dog.runSpeedMetersPerSecond());
        System.out.println(bird.flySpeedMetersPerSecond());
        System.out.println(fish.swimSpeedMetersPerSecond());
        maxSpeed = Math.max(a, bird.flySpeedMetersPerSecond());
        System.out.println("Max value is " + maxSpeed);

    }

}