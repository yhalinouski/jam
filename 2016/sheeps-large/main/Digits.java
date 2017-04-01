import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Digits {

    public static Set<Integer> parse(BigInteger num) {
	Set<Integer> res = new HashSet<>();
	while (!BigInteger.ZERO.equals(num)) {
	    BigInteger[] div = num.divideAndRemainder(BigInteger.TEN);
	    num = div[0];
	    BigInteger rem = div[1];
	    res.add(rem.intValue());
	}
	return res;
    }

}
