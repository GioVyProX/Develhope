package Ex2_AbstractClass;

public class Boat implements Movable{
    @Override
    public String moveForward() {
        return "Vai avanti";
    }

    @Override
    public String moveBackward() {
        return "Vai indietro";
    }
}
