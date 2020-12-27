package tutorial.tutorial3.test;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import tutorial.tutorial3.*;

class CTTestFit {
	FlightSeatFit2 fsf = new FlightSeatFit2();

	@DisplayName("CT Test fit")
	@ParameterizedTest(name = "{index} {0} {1} {2}")
	@MethodSource("parameterDataProvider")
	void bv_test(int passengers, boolean comfortFlag, Status status) {
		assertEquals(status, fsf.fit(passengers, comfortFlag));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(200, false, "FAILURE"), 
				Arguments.of(100, false, "SUCCESS"),
				Arguments.of(100, true, "FAILURE"), 
				Arguments.of(40, false, "SUCCESS"));
	}

}
