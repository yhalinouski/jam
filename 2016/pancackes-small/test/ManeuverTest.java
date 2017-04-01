import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ManeuverTest {

    @Test
    public void maneuverOneOnStackOfOnePlus() {
	boolean[] stack = new boolean[1];
	stack[0] = true;
	boolean[] stackRes = Maneuver.perform(stack, 1);
	assertEquals(1, stackRes.length);
	assertFalse(stackRes[0]);
    }
    
    @Test
    public void maneuverOneOnStackOfOneMinus() {
	boolean[] stack = new boolean[1];
	stack[0] = false;
	boolean[] stackRes = Maneuver.perform(stack, 1);
	assertEquals(1, stackRes.length);
	assertTrue(stackRes[0]);
    }
    
    @Test
    public void maneuverOneOnStackOfTwoPluses() {
	boolean[] stack = new boolean[2];
	stack[0] = true;
	stack[1] = true;
	boolean[] res = Maneuver.perform(stack, 1);
	assertEquals(2, res.length);
	assertFalse(res[0]);
	assertTrue(res[1]);
    }
    
    @Test
    public void maneuverThreeOnStackOfThreeMinusMinusPlusMinus() {
	boolean[] stack = new boolean[4];
	stack[0] = false;
	stack[1] = false;
	stack[2] = true;
	stack[3] = false;
	boolean[] res = Maneuver.perform(stack, 3);
	assertEquals(4, res.length);
	assertFalse(res[0]);
	assertTrue(res[1]);
	assertTrue(res[2]);
	assertFalse(res[3]);
    }
    
}
