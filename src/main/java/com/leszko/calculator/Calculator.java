package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
* Calculates the sum of two numbers and caches the result.
*/
@Service
public class Calculator {
        final static int UML_NUMBER_1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
