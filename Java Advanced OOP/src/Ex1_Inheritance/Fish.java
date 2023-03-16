package Ex1_Inheritance;

public class Fish extends Animal{

    String species;

    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double swimSpeedMetersPerSecond(){
        return getWeight()*2;
    }
    @Override
    public String toString() {
        return getHeight() + " - " + getWeight() + " - " + getSpecies();
    }
}
