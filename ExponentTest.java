import static org.junit.Assert.assertEquals;

import java.beans.Transient;

//import org.junit.BeforeEach;
import org.junit.Test;


public class ExponentTest {
    
    //@BeforeEach
    

    @Test
    public void testExp1() {
        Exponential exp = new Exponential();
        assertEquals(8.0, exp.computeExponent(2, 3), 0);
    }

    @Test
    public void testExp2() {
        Exponential exp = new Exponential();
        assertEquals(125, exp.computeExponent(5, 3), 0);
    }
}
