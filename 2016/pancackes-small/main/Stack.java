public class Stack {

    private static final char PLUS = "+".charAt(0);
    
    public static boolean[] parse(String s) {
	boolean[] stack = new boolean[s.length()];
	
	int i = 0;
	for (char c : s.toCharArray()) {
	    stack[i] = PLUS == c;
	    i++;
	}
	return stack;
    }

}
