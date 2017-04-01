import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumStepsFinder {

    private static Map<Integer, Integer> cache;

    public static int find(boolean[] stack) {
	cache = new HashMap<>();

	if (isAllHappy(stack))
	    return 0;

	int stackHash = Arrays.hashCode(stack);
	int minStepCount = Integer.MAX_VALUE - 10;
	for (int i = 1; i <= stack.length; i++) {
	    int resStepNum = step(stack, i, 1);
	    
	    if (cache.containsKey(stackHash)) {
		int cachedStepNum = cache.get(stackHash);
		cache.put(stackHash, Math.min(cachedStepNum, resStepNum));
	    } else {
		cache.put(stackHash, resStepNum);
	    }
	    
	    minStepCount = Math.min(minStepCount, resStepNum);
	}

	return minStepCount;
    }

    private static int step(boolean[] stack, int maneuverSize, int stepNum) {
	if (stepNum > 8) {
	    return Integer.MAX_VALUE - 10;
	}

	boolean[] newStack = Maneuver.perform(stack, maneuverSize);

	int newStackHash = Arrays.hashCode(newStack);
	if (cache.containsKey(newStackHash)) {
	    int cachedStepNum = cache.get(newStackHash);
	    if (cachedStepNum < stepNum) {
		return Integer.MAX_VALUE - 10;
	    }
	}

	if (isAllHappy(newStack)) {
	    if (cache.containsKey(newStackHash)) {
		int cachedStepNum = cache.get(newStackHash);
		cache.put(newStackHash, Math.min(cachedStepNum, stepNum));
	    } else {
		cache.put(newStackHash, stepNum);
	    }
	    return stepNum;
	}

	int minStepCount = Integer.MAX_VALUE - 10;
	for (int i = 1; i <= newStack.length; i++) {
	    int resStepNum = step(newStack, i, (stepNum + 1));
	    if (cache.containsKey(newStackHash)) {
		int cachedStepNum = cache.get(newStackHash);
		cache.put(newStackHash, Math.min(cachedStepNum, resStepNum));
	    } else {
		cache.put(newStackHash, resStepNum);
	    }

	    minStepCount = Math.min(minStepCount, resStepNum);
	}

	return minStepCount;
    }

    private static boolean isAllHappy(boolean[] stack) {
	for (boolean b : stack)
	    if (!b)
		return false;
	return true;
    }

}
