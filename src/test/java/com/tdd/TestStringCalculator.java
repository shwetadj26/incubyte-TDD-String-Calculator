package com.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class TestStringCalculator
{
	@Test
    public void testAddEmptyString()
	{
        StringCalculator calculator = new StringCalculator();
        int result = calculator.CheckforEmptyNumber("");
        assertEquals(0, result);                  
    } 
	
	@Test
	public void testAddSingleNumber() {
	    StringCalculator calculator = new StringCalculator();
	    int result = calculator.addOneNumber("5");
	    assertEquals(5, result);
	}
	
	@Test
	public void testAddTwoNumbers() {
	    StringCalculator calculator = new StringCalculator();
	    int result = calculator.addTwoNumber("1,2");
	    assertEquals(3, result);
	}

	@Test
	public void testAddMultipleNumbers() {
	    StringCalculator calculator = new StringCalculator();
	    int result = calculator.addMultipleNumber("1,2,3");
	    assertEquals(6, result);
	}

	  @Test
	    public void testAddWithCustomDelimiter() {
	        StringCalculator calculator = new StringCalculator();
	        assertEquals(6, calculator.CheckDelimiter("//|\n1|2|3"));
	        assertEquals(10, calculator.CheckDelimiter("//:\n1:2:3:4"));
	    }
	  
	  @Test
	    void testOnlyNegativeNumbersThrowException() 
	  {
	        StringCalculator calculator = new StringCalculator();

	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            calculator.checkNegtive("-1,-3,-3");
	        });
	        assertEquals("All numbers are negative: [-1, -3, -3]", exception.getMessage());
	    }

	
}
