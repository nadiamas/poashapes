import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by nadia on 02/10/2016.
 */
public class SquareTest {
    Square s ;
    @BeforeMethod
    public void setUp() throws Exception {
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

    @Test
    public void testPerimeter() throws Exception {
       s= new Square(1);
        assertEquals(4.0,s.perimeter());
    }

    @Test
    public void testSurface() throws Exception {
        s= new Square(2);
        assertEquals(4.0,s.surface());
    }


}