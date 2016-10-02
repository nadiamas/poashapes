import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nadia on 02/10/2016.
 */
public class ConeTest {
    Cone c ;
    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testVolume() throws Exception {
        c=new Cone(1,1);
        assertEquals(1.0466666666666666,c.volume());
    }

    @Test
    public void testSurface() throws Exception {
        c=new Cone(1,1);
        assertEquals(3.14,c.surface());

    }

}