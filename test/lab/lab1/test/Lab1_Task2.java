package lab.lab1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lab.lab1.Lab1_Program2_Fix;

public class Lab1_Task2 {
//	private final Lab1_Program2 lp2 = new Lab1_Program2();
	private final Lab1_Program2_Fix lp2 = new Lab1_Program2_Fix();

	@Test
	void test2_1() {
		// Cases EC- 2, 7, 11
		assertEquals(lp2.grade(25, 25), "Fail");
	}

	@Test
	void test2_2() {
		// Cases EC- 3, 9, 12
		assertEquals(lp2.grade(55, 80), "Pass,C");
	}

	@Test
	void test2_3() {
		// Cases EC- 4, 9, 13
		assertEquals(lp2.grade(65, 70), "Pass,B");
	}

	@Test
	void test2_4() {
		// Cases EC -5, 9, 14
		assertEquals(lp2.grade(80, 70), "Pass,A");
	}

	@Test
	void test2_5() {
		// Cases EC -1, 7, 15
		assertEquals(lp2.grade(-5, -5), "Marks out of range");
	}

	@Test
	void test2_6() {
		// Cases EC -1, 10, 15
		assertEquals(lp2.grade(-5, 120), "Marks out of range");
	}

	@Test
	void test2_7() {
		// Cases EC -6, 7, 15
		assertEquals(lp2.grade(120, -5), "Marks out of range");
	}

	@Test
	void test2_8() {
		// Cases EC -6, 10, 15
		assertEquals(lp2.grade(120, 120), "Marks out of range");
	}

}
