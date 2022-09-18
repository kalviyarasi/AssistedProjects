package mavenpro.maventarget;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {

	@Test
	public void test() {
		AgeValidator valid=new AgeValidator();
		assertEquals("right to vote",valid.ageValid(20));
	}

}
