import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NameNumber {

    private Set<Integer> digitsTrack;
    private final BigInteger initialNum;
    private BigInteger currentNum;
    
    private static final BigInteger MAX_NUM = BigInteger.valueOf(Long.MAX_VALUE).pow(100);

    public NameNumber(int n) {
	digitsTrack = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
	initialNum = BigInteger.valueOf(n);
	currentNum = initialNum;
    }

    public BigInteger execute() {
	if (BigInteger.ZERO.equals(currentNum))
	    return BigInteger.valueOf(-1);
	
	while (currentNum.compareTo(MAX_NUM) == -1) {
	    Set<Integer> numDigits = Digits.parse(currentNum);
	    digitsTrack.removeAll(numDigits);
	    if (digitsTrack.isEmpty())
		    return currentNum;

	    currentNum = currentNum.add(initialNum);
	}
	return BigInteger.valueOf(-1);
    }

}
