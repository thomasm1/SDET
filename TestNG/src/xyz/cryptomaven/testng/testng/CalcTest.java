package xyz.cryptomaven.testng.testng;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CalcTest {
	@Test
	public void addTest() {
		Calculator myCalc = new Calculator();
		AssertJUnit.assertEquals(10, myCalc.addNumbers(5, 5));
	}

	@Test
	public void subtractTest() {
		Calculator myCalc = new Calculator();
		AssertJUnit.assertEquals(5, myCalc.subtractNumbers(10, 5));
	}
}
