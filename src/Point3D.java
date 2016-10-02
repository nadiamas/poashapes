/**
 * Created by nadia on 01/10/2016.
 */
public class Point3D extends Point2D {

    private double z ;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void translate(double dx, double dy,double dz) {
        super.translate(dx, dy);
        z+=dz;
    }

    @Override
    public boolean IsOrigin() {
        return super.IsOrigin() && (z==0);
    }

    public double distance(Point3D p) {
        double dx = super.getX() - p.getX();
        double dy = super.getY() - p.getY();
        double dz = this.z - p.z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

    public double getZ() {
        return z;
    }
}
