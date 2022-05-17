package com.atamie.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
		Sum sum = new Sum();
		assertEquals(5,sum.sum(2,3));
	}
	@Test
	void testSubtract(){
		Sum sum = new Sum();
		assertEquals(1, sum.subtract(3,2));
	}
	@Test
	void testMultiply(){
		Sum sum = new Sum();
		assertEquals(6, sum.multiply(2,3));
	}

}
