import static org.testng.Assert.*;

/**
 * Created by nadia on 02/10/2016.
 */
public class Point3DTest {

    Point3D p ;
    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {

    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testTranslate() throws Exception {
        p=new Point3D(1,1,1);
        p.translate(0,0);
        assertEquals(1.0,p.getX());
        assertEquals(1.0,p.getY());
        assertEquals(1.0,p.getZ());
    }

    @org.testng.annotations.Test
    public void testIsOrigin() throws Exception {
         p=new Point3D(0,0,0);
        p.IsOrigin();
        assertEquals(true,p.IsOrigin());
    }

    @org.testng.annotations.Test
    public void testDistance() throws Exception {
         p=new Point3D(1,1,1);
       Point3D  p1=new Point3D(1,1,1);
        p.distance(p1);
        assertEquals(0.0,p.distance(p1));
    }

}