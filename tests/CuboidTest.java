import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nadia on 02/10/2016.
 */
public class CuboidTest {
    Cuboid c;
    @BeforeMethod
    public void setUp() throws Exception {
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testVolume() throws Exception {
        c=new Cuboid(1,2,1);
        assertEquals(2.0,c.volume());
    }

    @Test
    public void testSurface() throws Exception {
        c= new Cuboid(1,1,1);
        assertEquals(6.0,c.surface());
    }

}