import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NameNumber {

    private Set<Integer> digitsTrack;
    private int initialNum;
    private long currentNum;

    public NameNumber(int n) {
	digitsTrack = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
	initialNum = n;
	currentNum = n;
    }

    public long execute() {
	if (currentNum == 0)
	    return -1;
	
	while (currentNum < Long.MAX_VALUE - (initialNum + 1)) {
	    List<Integer> digits = Digits.parse(currentNum);
	    for (Integer digit : digits) {
		digitsTrack.remove(digit);
		if (digitsTrack.isEmpty())
		    return currentNum;
	    }
	    currentNum = currentNum + initialNum;
	}
	return -1;
    }

}
