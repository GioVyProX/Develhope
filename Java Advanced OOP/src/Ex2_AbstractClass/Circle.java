package Ex2_AbstractClass;

public class Circle extends Shape{



    public Circle(double radius){

        super(radius*2, radius*2);
    }

//    public Circle(double height, double width) {
//
//        super(height, width);
//        setWidth(this.getHeight());
//    }


    @Override
    double calculateArea() {
        return Math.PI * Math.pow(getHeight()/2, 2);
    }
}
