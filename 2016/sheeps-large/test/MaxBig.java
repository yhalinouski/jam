import java.math.BigInteger;

import org.junit.Test;

public class MaxBig {

    @Test
    public void maxBig() {
	BigInteger z = BigInteger.valueOf(Long.MAX_VALUE).pow(100);
	System.out.println(z);
    }
    
}
