import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PancakesRunner {

    public static void main(String[] args) throws IOException {
	
	Path inputFile = Paths.get("src/resources/B-small-attempt0.in");
	List<String> input = Files.readAllLines(inputFile);
	
	long start = System.currentTimeMillis();
	ProcessPancakes processing = new ProcessPancakes(input);
	List<Integer> output = processing.process();
	long runTime = System.currentTimeMillis() - start;
	System.out.println("processing took " + runTime + " ms");
	
	List<String> formattedOutput = new ArrayList<>();
	for (int i = 0; i < output.size(); i++) {
	    Integer num = output.get(i);
	    formattedOutput.add("Case #" + (i + 1) + ": " + num);
	}

	Path file = Paths.get("src/resources/output.txt");
	Files.write(file, formattedOutput);
    }
}