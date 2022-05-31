package testpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import namedpackage.Calculator;

public class CalculateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testSubstract() {
		int a = 5555;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b); 
			 	
		int expected = 4321;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testMultiple() {
		int a = 2;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		int expected = 4;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testDevide() {
		int a = 2;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.devide(a, b); 
			 
		int expected = 1;
		assertEquals (expected, actual);
		}


}
