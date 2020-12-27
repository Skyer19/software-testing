package edu.dapeng.st.slidedemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.dapeng.st.slidedemo.BMICalculator;

class TestBMICalculator {
	private final BMICalculator bc = new BMICalculator();

	@Test
	void test1_1() {
		// Cases EC-1, 7
		assertEquals(bc.calcBMI(9), BMICalculator.BMI_CATEGORY.UNDERWEIGHT);
	}

	@Test
	void test1_2() {
		// Cases EC-2, 8
		assertEquals(bc.calcBMI(22), BMICalculator.BMI_CATEGORY.HEALTHY);
	}

	@Test
	void test1_3() {
		// Cases EC-3, 9
		assertEquals(bc.calcBMI(27), BMICalculator.BMI_CATEGORY.OVERWEIGHT);
	}

	@Test
	void test1_4() {
		// Cases EC-4, 10
		assertEquals(bc.calcBMI(35), BMICalculator.BMI_CATEGORY.OBESE);
	}

	@Test
	void test1_5() {
		// Cases EC-5, 11
		assertEquals(bc.calcBMI(50), BMICalculator.BMI_CATEGORY.EXTREMELY_OBESE);
	}

	@Test
	void test1_6() {
		// Cases EC-6, 12
		assertEquals(bc.calcBMI(-1), BMICalculator.BMI_CATEGORY.INVALID);
	}

}
