/**
 * Created by nadia on 02/10/2016.
 */
public  class Sphere  extends  Shape3D{

    private double radius ;

    public Sphere(Point3D refPoint, double radius) {
        super(refPoint);
        this.radius = radius;
    }
    public Sphere( double radius) {

        this.radius = radius;
    }

    @Override
    public double volume() {
        double v = 4*3.14*radius*radius*radius;
        return v/3;
    }

    @Override
    public double surface() {

        return 4*3.14*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

}
