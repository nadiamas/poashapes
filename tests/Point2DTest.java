import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nadia on 02/10/2016.
 */
public class Point2DTest {
    Point2D p  ;
    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testTranslate() throws Exception {
         p=new Point2D(1,1);
        p.translate(0,0);
        assertEquals(1.0,p.getX());
        assertEquals(1.0,p.getY());
    }

    @Test
    public void testIsOrigin() throws Exception {
        Point2D p=new Point2D(0,0);
        p.IsOrigin();
        assertEquals(true,p.IsOrigin());
    }

    @Test
    public void testDistance() throws Exception {
        Point2D p=new Point2D(1,1);
        Point2D p1=new Point2D(1,1);
        p.distance(p1);
        assertEquals(0.0,p.distance(p1));

    }

    @Test
    public void testGetX() throws Exception {

    }

    @Test
    public void testGetY() throws Exception {

    }

}