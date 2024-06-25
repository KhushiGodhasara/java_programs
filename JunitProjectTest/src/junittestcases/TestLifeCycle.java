package junittestcases;

//demonstrate life cycle of 

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycle {

	@BeforeEach
	void beforeEachTest()//prints 2nd //printed 5th
	{
		System.out.println("Before Each Test");
	}
	
	@AfterEach
	void afterEachTest()//printed 4th //printed 7th
	{
		System.out.println("After Each Test");
	}
	
	@BeforeAll
	void beforeAllTests()//prints 1st
	{
		System.out.println("Before All Tests");
	}
	
	@AfterAll
	void afterAllTests()//printed 8th
	{
		System.out.println("After All Test");
	}
	
	@Test
	void testMethod1()//printed 3rd
	{
		System.out.println("Test Method 1.....");
	}
	
	@Test
	void testMethod2()//printed 6th
	{
		System.out.println("Test Method 2.....");
	}
}

