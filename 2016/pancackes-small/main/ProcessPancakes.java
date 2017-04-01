import java.util.ArrayList;
import java.util.List;

public class ProcessPancakes {
    
    private List<String> input;

    public ProcessPancakes(List<String> input) {
	this.input = input;
    }

    public List<Integer> process() {
	List<Integer> res = new ArrayList<>();
	
	int problemSize = Integer.parseInt(input.get(0));
	for (int i = 1; i <= problemSize; i++) {
	    String stackData = input.get(i);
	    boolean[] stack = Stack.parse(stackData);
	    int minSteps = MinimumStepsFinder.find(stack);
	    res.add(minSteps);
	}
	
	return res;
    }

}
