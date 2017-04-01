import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NameNumberTest {

    @Test
    public void fromZero() {
	NameNumber nn = new NameNumber(0);
	assertEquals(-1, nn.execute());
    }
    
    @Test
    public void fromOne() {
	NameNumber nn = new NameNumber(1);
	assertEquals(10, nn.execute());
    }
    
    @Test
    public void fromTwo() {
	NameNumber nn = new NameNumber(2);
	assertEquals(90, nn.execute());
    }
    
    @Test
    public void fromEleven() {
	NameNumber nn = new NameNumber(11);
	assertEquals(110, nn.execute());
    }
    
    @Test
    public void from1692() {
	NameNumber nn = new NameNumber(1692);
	assertEquals(5076, nn.execute());
    }

}
