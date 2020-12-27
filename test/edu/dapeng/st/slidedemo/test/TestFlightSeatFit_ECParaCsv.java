package edu.dapeng.st.slidedemo.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import edu.dapeng.st.slidedemo.FlightSeatFit;
import edu.dapeng.st.slidedemo.Status;

public class TestFlightSeatFit_ECParaCsv {
	private final FlightSeatFit fsf = new FlightSeatFit();

	@DisplayName("Equivalence Class Testing")
	@ParameterizedTest
	@CsvFileSource(resources = "/edu/dapeng/st/slidedemo/test/ECTestData.csv")
	void test_ec_1_to_4(int passengers, boolean comfortFlag, Status status) {
		assertEquals(status, fsf.fit(passengers, comfortFlag));
	}

}
