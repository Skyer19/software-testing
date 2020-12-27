package tutorial.tutorial5.test.coveragetest;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import tutorial.tutorial5.coverage.FitImpl2;
import tutorial.tutorial5.coverage.Status;

class SCTestFitImpl2 {

	FitImpl2 fi2 = new FitImpl2();

	@DisplayName("SC Test fit impl 1")
	@ParameterizedTest(name = "{index} {0} {1} {2}")
	@MethodSource("parameterDataProvider")
	void bv_test(int passengers, boolean comfortFlag, Status status) {
		assertEquals(status, fi2.fit(passengers, comfortFlag));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of(-100, true, "ERROR"), Arguments.of(100, true, "FAILURE"));
	}

}
