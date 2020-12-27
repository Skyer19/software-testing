package edu.dapeng.st.slidedemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.dapeng.st.slidedemo.FlightSeatFit;
import edu.dapeng.st.slidedemo.Status;

class TestFlightSeatFit_EC {
	private final FlightSeatFit fsf = new FlightSeatFit();

	@Test
	void test1_1() {
		// Cases: EC-2, 5, 7
		assertEquals(fsf.fit(40, false), Status.SUCCESS);
	}

	@Test
	void test1_2() {
		// Cases: EC-3, 6, 8
		assertEquals(fsf.fit(101, true), Status.FAILURE);
	}

	@Test
	void test1_3() {
		// Cases: EC-4
		assertEquals(fsf.fit(200, false), Status.FAILURE);
	}

	@Test
	void test1_4() {
		// Cases: EC-1, 9
		assertEquals(fsf.fit(-100, false), Status.ERROR);
	}

}
