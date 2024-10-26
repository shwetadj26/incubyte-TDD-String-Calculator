package com.tdd;

import java.util.List;

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
	
	

	    public int CheckDelimiter(String input) {
	        String delimiter = ","; 
	        String numbers = input;

	        if (input.startsWith("//")) {
	            int delimiterEndIndex = input.indexOf("\n");
	            if (delimiterEndIndex != -1) {
	                delimiter = input.substring(2, delimiterEndIndex);
	                numbers = input.substring(delimiterEndIndex + 1);
	            }
	        }

	        String[] numStrings = numbers.split("[\n" + delimiter + "]");
	        int sum = 0;

	        for (String numStr : numStrings) {
	            if (!numStr.trim().isEmpty()) { 
	                sum += Integer.parseInt(numStr);
	            }
	        }

	        return sum;
	    }
	}



