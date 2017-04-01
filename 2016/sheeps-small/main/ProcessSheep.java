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

    public List<Long> process() {
        List<Long> output = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            long n = process(data.get(i));
            output.add(n);
        }
        return output;
    }

    private long process(int n) {
	NameNumber nn = new NameNumber(n);
	return nn.execute();
    }

}
