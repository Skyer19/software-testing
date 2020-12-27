package edu.dapeng.st.slidedemo.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import edu.dapeng.st.slidedemo.FlightSeatFit;
import edu.dapeng.st.slidedemo.Status;

class TestFlightSeatFit_ECPara {
	private final FlightSeatFit fsf = new FlightSeatFit();

	@DisplayName("Equivalence Class Testing")
	@ParameterizedTest
	@CsvSource({ "40, false, SUCCESS", 
				 "101, true, FAILURE", 
				 "200, false, FAILURE",  
				 "-100, false, ERROR" 
				 })
	void test_ec_1_to_4(int passengers, boolean comfortFlag, Status status) {
		assertEquals(status, fsf.fit(passengers, comfortFlag));
	}

}
