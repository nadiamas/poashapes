/**
 * Created by nadia on 01/10/2016.
 */
public class Point2D {

    private double x ;
    private double y ;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double dx , double dy)
    {
        this.x=this.x + dx;
        this.y=this.y + dy;
    }

    public boolean IsOrigin(){
        return (x==0 && y==0);
    }



    public double distance (Point2D p){
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}
