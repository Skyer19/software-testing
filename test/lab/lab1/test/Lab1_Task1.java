package lab.lab1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lab.lab1.Lab1_Program1_Fix;

class Lab1_Task1 {
//	private final Lab1_Program1 lpf1 = new Lab1_Program1();
	private final Lab1_Program1_Fix lpf1 = new Lab1_Program1_Fix();

	@Test
	void test1_1() {
		// Cases EC-1, 3, 7
		assertEquals(lpf1.calcInsurance(true, true), 20);
	}

	@Test
	void test1_2() {
		// Cases EC-2, [3], 6
		assertEquals(lpf1.calcInsurance(false, true), 10);
	}

	@Test
	void test1_3() {
		// Cases EC-2, [3], 6
		assertEquals(lpf1.calcInsurance(false, false), 5);
	}
}
