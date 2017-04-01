import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ProcessSheep {

    private int size;
    private List<Integer> data;
    
    public ProcessSheep(List<String> inputData) {
	size = Integer.parseInt(inputData.get(0));
	data = new ArrayList<>(size);
	for (int i = 1; i <= size; i++) {
	    data.add(Integer.parseInt(inputData.get(i)));
	}
    }

    public List<BigInteger> process() {
        List<BigInteger> output = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            BigInteger n = process(data.get(i));
            output.add(n);
        }
        return output;
    }

    private BigInteger process(int n) {
	NameNumber nn = new NameNumber(n);
	return nn.execute();
    }

}
