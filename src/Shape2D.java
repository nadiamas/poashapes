/**
 * Created by nadia on 02/10/2016.
 */
public abstract class Shape2D extends  Shape implements  Translatable2D{

    private Point2D refPoint ;

    public Shape2D(Point2D refPoint) {

        this.refPoint = refPoint;
    }
    public Shape2D() {
    }


    public abstract double perimeter();

    public Point2D getRefPoint() {
        return refPoint;
    }
}
