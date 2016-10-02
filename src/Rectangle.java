/**
 * Created by nadia on 02/10/2016.
 */
public class Rectangle extends Shape2D{

    private double length ;
    private double width ;

    public Rectangle(Point2D refPoint, double length, double width) {
        super(refPoint);
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle() {

    }


    @Override
    public double perimeter() {
        return (length+width)*2;
    }

    @Override
    public double surface() {
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

