package JunitTests;

import static org.junit.Assert.*;

import org.junit.*;

import junit.framework.Assert;
import mainPackage.*;

public class UnitTests {
	
	String outputMess = "Hello World! for the 4th time";
	
	@Test
	public void ouputTest() {
		assertEquals("Didn't pass", outputMess, ExerciseOne.outPut());
	}
	
}
