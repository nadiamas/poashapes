/**
 * Created by nadia on 02/10/2016.
 */
public class Cone extends Shape3D {
    private double height ;
    private double radius ;

    public Cone() {
    }

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double volume() {
        double v = (3.14*radius*radius*height)/3;
        return  v ;
    }

    @Override
    public double surface() {
        return 3.14*height*radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }
}
