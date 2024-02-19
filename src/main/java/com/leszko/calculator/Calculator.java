package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
* Calculates the sum of two numbers and caches the result.
*
* @param a the first number
* @param b the second number
* @return the sum of the two numbers
*/
@Service
public class Calculator {
        final static int umlNUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
