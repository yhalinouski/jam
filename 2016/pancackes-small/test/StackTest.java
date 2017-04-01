import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackTest {

    @Test
    public void onePlus() {
	boolean[] res = Stack.parse("+");
	assertEquals(1, res.length);
	assertTrue(res[0]);
    }
    
    @Test
    public void oneMinus() {
	boolean[] res = Stack.parse("-");
	assertEquals(1, res.length);
	assertFalse(res[0]);
    }
    
    @Test 
    public void three() {
	boolean[] res = Stack.parse("-++");
	assertEquals(3, res.length);
	assertFalse(res[0]);
	assertTrue(res[1]);
	assertTrue(res[2]);
    }
    
}
