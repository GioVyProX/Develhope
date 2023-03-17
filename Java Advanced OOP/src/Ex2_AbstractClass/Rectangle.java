package Ex2_AbstractClass;

public class Rectangle extends Shape{


    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    double calculateArea() {
        return this.getHeight() * this.getWidth();
    }
}
