package lab.lab1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lab.lab1.Lab1_Program3_Fix;

public class Lab1_Task3 {

//	private final Lab1_Program3 lp3 = new Lab1_Program3();
	private final Lab1_Program3_Fix lp3 = new Lab1_Program3_Fix();

	@Test
	void test3_1() {
		// Cases EC-1, 5, 8, 13
		assertEquals(lp3.CarIns(15, 'M', true), 0);
	}

	@Test
	void test3_2() {
		// Cases EC-1, 5, 9, 13
		assertEquals(lp3.CarIns(15, 'M', false), 0);
	}

	@Test
	void test3_3() {
		// Cases EC-1, 6, 8, 13
		assertEquals(lp3.CarIns(15, 'F', true), 0);
	}

	@Test
	void test3_4() {
		// Cases EC-1, 6, 9, 13
		assertEquals(lp3.CarIns(15, 'F', false), 0);
	}

	@Test
	void test3_5() {
		// Cases EC-1, 7, 8, 13
		assertEquals(lp3.CarIns(15, 'P', true), 0);
	}

	@Test
	void test3_6() {
		// Cases EC-1, 7, 9, 13
		assertEquals(lp3.CarIns(15, 'P', false), 0);
	}

	@Test
	void test3_7() {
		// Cases EC-2, 5, 8, 15
		assertEquals(lp3.CarIns(20, 'M', true), 300);
	}

	@Test
	void test3_8() {
		// Cases EC-2, 5, 9, 10
		assertEquals(lp3.CarIns(20, 'M', false), 2000);
	}

	@Test
	void test3_9() {
		// Cases EC-2, 6, 8, 11
		assertEquals(lp3.CarIns(20, 'F', true), 300);
	}

	@Test
	void test3_10() {
		// Cases EC-2, 6, 9, 11
		assertEquals(lp3.CarIns(20, 'F', false), 300);
	}

	@Test
	void test3_11() {
		// Cases EC-2, 7, 8, 13
		assertEquals(lp3.CarIns(20, 'P', true), 0);
	}

	@Test
	void test3_12() {
		// Cases EC-1, 7, 9, 13
		assertEquals(lp3.CarIns(20, 'P', false), 0);
	}

	@Test
	void test3_13() {
		// Cases EC-3, 5, 8, 12
		assertEquals(lp3.CarIns(50, 'M', true), 200);
	}

	@Test
	void test3_14() {
		// Cases EC-3, 5, 9, 12
		assertEquals(lp3.CarIns(50, 'M', false), 400);
	}

	@Test
	void test3_15() {
		// Cases EC-3, 6, 8, 16
		assertEquals(lp3.CarIns(50, 'F', true), 200);
	}

	@Test
	void test3_16() {
		// Cases EC-3, 6, 9, 16
		assertEquals(lp3.CarIns(50, 'F', false), 200);
	}

	@Test
	void test3_17() {
		// Cases EC-3, 7, 8, 13
		assertEquals(lp3.CarIns(50, 'P', true), 0);
	}

	@Test
	void test3_18() {
		// Cases EC-3, 7, 9, 13
		assertEquals(lp3.CarIns(50, 'P', false), 0);
	}

	@Test
	void test3_19() {
		// Cases EC-4, 5, 8, 13
		assertEquals(lp3.CarIns(80, 'M', true), 0);
	}

	@Test
	void test3_20() {
		// Cases EC-4, 5, 9, 13
		assertEquals(lp3.CarIns(80, 'M', false), 0);
	}

	@Test
	void test3_21() {
		// Cases EC-4, 6, 8, 13
		assertEquals(lp3.CarIns(80, 'F', true), 0);
	}

	@Test
	void test3_22() {
		// Cases EC-4, 6, 9, 13
		assertEquals(lp3.CarIns(80, 'F', false), 0);
	}

	@Test
	void test3_23() {
		// Cases EC-4, 7, 8, 13
		assertEquals(lp3.CarIns(80, 'P', true), 0);
	}

	@Test
	void test3_24() {
		// Cases EC-4, 7, 9, 13
		assertEquals(lp3.CarIns(80, 'P', false), 0);
	}

}
