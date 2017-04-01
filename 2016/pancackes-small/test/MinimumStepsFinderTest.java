import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumStepsFinderTest {

    @Test
    public void plus() {
	boolean[] stack = new boolean[1];
	stack[0] = true;
	assertEquals(0, MinimumStepsFinder.find(stack));
    }
    
    @Test
    public void minus() {
	boolean[] stack = new boolean[1];
	stack[0] = false;
	assertEquals(1, MinimumStepsFinder.find(stack));
    }
    
    @Test
    public void minusPlus() {
	boolean[] stack = new boolean[2];
	stack[0] = false;
	stack[1] = true;
	assertEquals(1, MinimumStepsFinder.find(stack));
    }
    
    @Test
    public void plusMinus() {
	boolean[] stack = new boolean[2];
	stack[0] = true;
	stack[1] = false;
	assertEquals(2, MinimumStepsFinder.find(stack));
    }
    
    @Test
    public void threePluses() {
	boolean[] stack = new boolean[3];
	stack[0] = true;
	stack[1] = true;
	stack[2] = true;
	assertEquals(0, MinimumStepsFinder.find(stack));
    }
    
    @Test
    public void minusMinusPlusMinus() {
	boolean[] stack = new boolean[4];
	stack[0] = false;
	stack[1] = false;
	stack[2] = true;
	stack[3] = false;
	assertEquals(3, MinimumStepsFinder.find(stack));
    }
    
    
}
