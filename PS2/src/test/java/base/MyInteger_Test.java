package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
		MyInteger numberA = new MyInteger(10);
		MyInteger numberB = new MyInteger(9);
		MyInteger numberC = new MyInteger(7);
		MyInteger numberD = new MyInteger(1);
		
		assertTrue(numberA.isEven());
		assertFalse(numberB.isEven());
		assertTrue(numberB.isOdd());
		assertFalse(numberA.isOdd());
		assertFalse(numberA.isPrime());
		assertTrue(numberC.isPrime());
		assertTrue(numberD.isPrime());
		
		int numberE=16;
		int numberF=15;
		int numberG=19;
		int numberH=1;
		
		assertTrue(MyInteger.isEven(numberE));
		assertFalse(MyInteger.isEven(numberF));
		assertTrue(MyInteger.isOdd(numberF));
		assertFalse(MyInteger.isOdd(numberE));
		assertTrue(MyInteger.isPrime(numberG));
		assertFalse(MyInteger.isPrime(numberE));
		assertTrue(MyInteger.isPrime(numberH));
		
		assertTrue(MyInteger.isEven(numberA));
		assertFalse(MyInteger.isEven(numberB));
		assertTrue(MyInteger.isOdd(numberB));
		assertFalse(MyInteger.isOdd(numberA));
		assertFalse(MyInteger.isPrime(numberA));
		assertTrue(MyInteger.isPrime(numberC));
		assertTrue(MyInteger.isPrime(numberD));
		
		assertTrue(numberA.equals(10));
		assertFalse(numberA.equals(numberB));
		
		assertEquals(numberB.getiValue(),9);
		
		
		
	}
	
}
