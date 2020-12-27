package tutorial.tutorial4.test.randomtesting.test;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import tutorial.tutorial4.cc.FitImpl1;
import tutorial.tutorial4.common.Status;


class SCTestFitImpl1 {
	
	FitImpl1 fi1 = new FitImpl1();
	
	@DisplayName("SC Test fit impl 1")
	@ParameterizedTest(name = "{index} {0} {1} {2}")
	@MethodSource("parameterDataProvider")
	void bv_test(int passengers, boolean comfortFlag, Status status) {
		assertEquals(status, fi1.fit(passengers, comfortFlag));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of(40, true, "SUCCESS"), Arguments.of(-100, false, "ERROR"));
	}

}
