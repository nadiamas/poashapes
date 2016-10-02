import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nadia on 02/10/2016.
 */
public class SphereTest {
    Sphere s ;
    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testVolume() throws Exception {
        s=new Sphere(1);
        assertEquals(4.1866666666666665,s.volume());
    }

    @Test
    public void testSurface() throws Exception {
        s=new Sphere(1);
        assertEquals(12.56,s.surface());
    }

}