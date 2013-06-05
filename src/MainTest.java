import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class MainTest {

	@Test
	public void test() {
		Main main = new Main();
		Assert.assertEquals("Hello World", main.printHelloWorld());
	}

}
