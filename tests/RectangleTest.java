import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nadia on 02/10/2016.
 */
public class RectangleTest {
    Rectangle r ;
    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testPerimeter() throws Exception {
        r= new Rectangle(1,2);
        assertEquals(6.0,r.perimeter());
    }

    @Test
    public void testSurface() throws Exception {
        r= new Rectangle(1,2);
        assertEquals(2.0,r.surface());
    }

}