package com.tdd;

public class StringCalculator
{
	public int CheckforEmptyNumber(String numbers)
	{
		return 0;
    }
	
	public int addOneNumber(String numbers) {
	    if (numbers.isEmpty()) {
	        return 0;
	    } else {
	        return Integer.parseInt(numbers);
	    }
	}

}
