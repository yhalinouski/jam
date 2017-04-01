import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SheepCountingRunner {

    public static void main(String[] args) throws IOException {
	
	long start1 = System.currentTimeMillis();
	Path inputFile = Paths.get("src/resources/A-large.in");
	List<String> inputData = Files.readAllLines(inputFile);
	long runTime1 = System.currentTimeMillis() - start1;
	System.out.println("reading file took " + runTime1 + " ms");
	
	long start2 = System.currentTimeMillis();
	ProcessSheep processing = new ProcessSheep(inputData);
	List<BigInteger> output = processing.process();
	long runTime2 = System.currentTimeMillis() - start2;
	
	System.out.println("counting took " + runTime2 + " ms");
	
	long start3 = System.currentTimeMillis();
	List<String> formattedOutput = new ArrayList<>();
	for (int i = 0; i < output.size(); i++) {
	    BigInteger num = output.get(i);
	    String str = ( BigInteger.valueOf(-1).equals(num) ) ? "INSOMNIA" : num.toString();
	    formattedOutput.add("Case #" + (i + 1) + ": " + str);
	}

	Path file = Paths.get("src/resources/output.txt");
	Files.write(file, formattedOutput);
	long runTime3 = System.currentTimeMillis() - start3;
	
	System.out.println("writing to file took " + runTime3 + " ms");

    }
}