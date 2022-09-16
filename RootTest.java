import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class RootTest {

    @Test
    public void testRoot1() {
        Root r = new Root();
        assertEquals(2.0, r.computeRoot(8, 3), 0.001);
    }

    @Test
    public void testRoot2() {
        Root r = new Root();
        assertEquals(5.0, r.computeRoot(125, 3), 0.001);
    }
}
