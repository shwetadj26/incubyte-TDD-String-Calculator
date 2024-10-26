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
	
	public int addTwoNumber(String numbers) {
	    if (numbers.isEmpty()) {
	        return 0;
	    } else if (numbers.contains(",")) {
	        String[] nums = numbers.split(",");
	        return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
	    } else {
	        return Integer.parseInt(numbers);
	    }
	}
	
	public int addMultipleNumber(String numbers) {
	    if (numbers.isEmpty()) {
	        return 0;
	    } else {
	        String[] nums = numbers.split(",");
	        int sum = 0;
	        for (String num : nums) {
	            sum += Integer.parseInt(num);
	        }
	        return sum;
	    }
	}

}
