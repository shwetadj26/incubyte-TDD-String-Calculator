package com.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}