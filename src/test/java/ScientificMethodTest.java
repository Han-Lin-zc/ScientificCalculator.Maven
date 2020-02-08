import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScientificMethodTest {

    @Test
    public void TestswitchDisplayMode()
    {
        ScientificMethod scientificMethod1 = new ScientificMethod();
        scientificMethod1.switchDisplayMode(1);
        assertEquals(1, scientificMethod1.getI());
    }


}
