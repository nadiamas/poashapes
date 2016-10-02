/**
 * Created by nadia on 02/10/2016.
 */
public class Square extends Rectangle {

    private double length ;

    public Square(double length, double width) {
        super(length, width);
    }
    public Square(double length) {
       this.length= length;
    }

    @Override
    public double perimeter() {
        return 4*length;
    }

    @Override
    public double surface() {
        return length*length;
    }

    @Override
    public double getLength() {
        return length;
    }
}
