
public class Maneuver {

    public static boolean[] perform(boolean[] stack, int maneuverSize) {
	boolean[] res = new boolean[stack.length];
	for (int i = 0; i < maneuverSize; i++)
	    res[i] = !stack[(maneuverSize - 1) - i];
	
	for (int i = maneuverSize; i < stack.length; i++)
	    res[i] = stack[i];
	return res;
    }

}
