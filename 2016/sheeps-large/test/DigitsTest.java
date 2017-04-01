import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;

import org.junit.Test;

public class DigitsTest {

    @Test
    public void oneDigit() {
	Set<Integer> res = Digits.parse(BigInteger.valueOf(5));
	assertEquals(1, res.size());
	assertTrue(res.contains(Integer.parseInt("5")));
    }

    @Test
    public void fiveDigits() {
	Set<Integer> res = Digits.parse(BigInteger.valueOf(12345));
	assertEquals(5, res.size());
	assertTrue(res.containsAll(
		Arrays.asList(Integer.parseInt("5"),
			Integer.parseInt("4"), 
			Integer.parseInt("3"), 
			Integer.parseInt("2"),
			Integer.parseInt("1"))));
    }

}
