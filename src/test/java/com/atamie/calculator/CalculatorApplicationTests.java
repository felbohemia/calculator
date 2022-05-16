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

}
