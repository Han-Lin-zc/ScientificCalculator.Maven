import com.zipcodewilmington.scientificcalculator.ScientificMethod;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScientificMethodTest {

    @Test
    public void testSwitchDisplayMode()
    {
        ScientificMethod scientificMethod1 = new ScientificMethod();
        scientificMethod1.switchDisplayMode(ScientificMethod.DisplayMode.BINARY);
        assertEquals(ScientificMethod.DisplayMode.BINARY, scientificMethod1.getDisplayMode());
    }

    @Test
    public void testGetSquare()
    {
        ScientificMethod scientificMethod1 = new ScientificMethod();
        scientificMethod1.getSquare(2);
        assertEquals(4,2, scientificMethod1.getJ());
    }
    @Test
    public void testGetSquare1()
    {
        double value = 4;
        ScientificMethod scientificMethod1  = new ScientificMethod();
        scientificMethod1.getSquare(4);
        assertEquals(16, (value * value), scientificMethod1.getJ());
    }

    @Test
    public void testSqrt()
    {
        ScientificMethod scientificMethod1 = new ScientificMethod();
        scientificMethod1.sqrt(4);
        assertEquals(2, 2, scientificMethod1.getK());
    }

    @Test
    public void testInvSqrt()
    {

    }
}
