import java.util.ArrayList;
import java.util.List;

public class Digits {

    public static List<Integer> parse(long currentNum) {
	String s = String.valueOf(currentNum);
	List<Integer> res = new ArrayList<Integer>(s.length());
	for (char c : s.toCharArray())
	    res.add(Character.getNumericValue(c));
	return res;
    }

}
