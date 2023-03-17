package Ex2_AbstractClass;

public class Car implements Movable{
    @Override
    public String moveForward() {
        return "Prima marcia";
    }

    @Override
    public String moveBackward() {
        return "Retromarcia";
    }
}
