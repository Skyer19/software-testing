package tutorial.tutorial3.test;


import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import tutorial.tutorial3.*;

class CTTestPremium {

	InsurancePremium ip = new InsurancePremium();

	@DisplayName("CT Test")
	@ParameterizedTest(name = "{index} {0} {1} {2} {3}")
	@MethodSource("parameterDataProvider")
	void bv_test(int age, char gender, boolean married, int premium) {
		assertEquals(premium, ip.calcPremium(age, gender, married));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(20, 'M', true, 300), 
				Arguments.of(20, 'M', false, 2000),
				Arguments.of(20, 'F', true, 300), 
				Arguments.of(30, 'M', true, 300), 
				Arguments.of(30, 'M', false, 500),
				Arguments.of(30, 'F', false, 300), 
				Arguments.of(50, 'M', true, 200), 
				Arguments.of(50, 'M', false, 400),
				Arguments.of(50, 'F', true, 200));
	}
}