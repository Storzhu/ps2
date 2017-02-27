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
	public void TestisEven() {
		int num1 = 1;
		int num2 = 2;
		assertTrue(MyInteger.isEven(num2));
		assertFalse(MyInteger.isEven(num1));
		MyInteger new1 = new MyInteger(num1);
		MyInteger new2 = new MyInteger(num2);
		assertFalse(new1.isEven(new1));
		assertTrue(new2.isEven(new2));
	}

	@Test
	public void TestisOdd() {
		int num3 = 3;
		int num4 = 4;
		assertTrue(MyInteger.isOdd(num3));
		assertFalse(MyInteger.isOdd(num4));
		MyInteger new3 = new MyInteger(num3);
		MyInteger new4 = new MyInteger(num4);
		assertFalse(new4.isOdd(new4));
		assertTrue(new3.isOdd(new3));
	}

	@Test
	public void TestisPrime() {
		int num5 = 5;
		int num7 = 7;
		int num8 = 8;
		MyInteger new5 = new MyInteger(num5);
		MyInteger new7 = new MyInteger(num7);
		MyInteger new8 = new MyInteger(num8);
		assertTrue(MyInteger.isPrime(num5));
		assertTrue(MyInteger.isPrime(num7));
		assertFalse(MyInteger.isPrime(num8));
		assertTrue(new5.isPrime(new5));
		assertTrue(new7.isPrime(new7));
		assertFalse(new8.isPrime(new8));

	}

	@Test
	public void Testequals() {
		int num12 = 12;
		MyInteger new12 = new MyInteger(num12);
		assertTrue(new12.equals(num12));

	}
}