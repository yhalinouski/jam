import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class DigitsTest {

    @Test
    public void oneDigit() {
	List<Integer> res = Digits.parse(5);
	assertEquals(1, res.size());
	assertEquals(5, res.get(0).intValue());
    }
    
    @Test
    public void fiveDigits() {
	List<Integer> res = Digits.parse(12345);
	assertEquals(5, res.size());
	assertEquals(1, res.get(0).intValue());
	assertEquals(2, res.get(1).intValue());
	assertEquals(3, res.get(2).intValue());
	assertEquals(4, res.get(3).intValue());
	assertEquals(5, res.get(4).intValue());
    }
    
}
