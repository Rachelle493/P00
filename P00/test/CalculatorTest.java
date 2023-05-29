import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {


	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a=1244;
		int b=8765;
		
		Calculator cal=new Calculator();
		int actual=cal.add(a, b);
		
		int expected=9999;
		assertEquals(expected,actual);
	}
	@Test
	public void testSubtract() {
		int a=9876;
		int b=4321;
		
		Calculator cal=new Calculator();
		int actual=cal.subtract(a, b);
		
		int expected=5555;
		assertEquals(actual,expected);
	}
	@Test
	public void testMultiple() {
		int a=2;
		int b=7;
		
		Calculator cal=new Calculator();
		int actual=cal.multiple(a,b);
		
		int expected=14;
		assertEquals(expected,actual);
		
	}
	@Test
	public final void testDivide() {
		int a=30;
		int b=3;
		
		Calculator cal=new Calculator();
		int actual=cal.divide(a, b);
		
		int expected=10;
		assertEquals(actual,expected);
	}

}
