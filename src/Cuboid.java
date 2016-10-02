/**
 * Created by nadia on 02/10/2016.
 */
public class Cuboid extends  Shape3D{

    private double length ;
    private double width ;
    private double height ;

    public Cuboid(Point3D refPoint, double length, double width, double height) {
        super(refPoint);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Cuboid( double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume(){
        return length*width*height;
    }

    public double surface(){
        double s = (length*width)+(width*height)+(height*length);
        return 2*s;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
