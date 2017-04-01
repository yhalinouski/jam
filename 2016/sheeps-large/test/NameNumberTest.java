import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class NameNumberTest {

    @Test
    public void fromZero() {
	NameNumber nn = new NameNumber(0);
	assertEquals(BigInteger.valueOf(-1), nn.execute());
    }
    
    @Test
    public void fromOne() {
	NameNumber nn = new NameNumber(1);
	assertEquals(BigInteger.valueOf(10), nn.execute());
    }
    
    @Test
    public void fromTwo() {
	NameNumber nn = new NameNumber(2);
	assertEquals(BigInteger.valueOf(90), nn.execute());
    }
    
    @Test
    public void fromEleven() {
	NameNumber nn = new NameNumber(11);
	assertEquals(BigInteger.valueOf(110), nn.execute());
    }
    
    @Test
    public void from1692() {
	NameNumber nn = new NameNumber(1692);
	assertEquals(BigInteger.valueOf(5076), nn.execute());
    }

}
