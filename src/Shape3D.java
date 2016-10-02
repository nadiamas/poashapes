/**
 * Created by nadia on 02/10/2016.
 */
public abstract class Shape3D extends Shape  implements Translatable3D{

    private Point3D refPoint ;

    public Shape3D(Point3D refPoint) {
        this.refPoint = refPoint;
    }
    public Shape3D(){

    }

    public abstract double volume();

    public Point3D getRefPoint() {
        return refPoint;
    }

}
