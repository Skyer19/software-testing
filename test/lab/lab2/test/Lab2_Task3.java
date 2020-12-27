package lab.lab2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab2.*;

class Lab2_Task3 {
//	Lab2_Program3 ip = new Lab2_Program3();
	Lab2_Program3_Fix ip = new Lab2_Program3_Fix();

	@DisplayName("Lab2_Task3")
	@ParameterizedTest(name = "{index} {0} {1} {2} {3}")
	@MethodSource("parameterDataProvider")
	void bv_test(int age, char gender, boolean married, int premium) {
		assertEquals(premium, ip.CarIns(age, gender, married));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(16, 'M', false, 2000), 
				Arguments.of(24, 'F', true, 300),
				Arguments.of(25, 'M', false, 500), 
				Arguments.of(44, 'M', false, 500), 
				Arguments.of(45, 'M', true, 200),
				Arguments.of(65, 'M', false, 400), 
				Arguments.of(Integer.MIN_VALUE, 'M', false, 0),
				Arguments.of(15, 'M', false, 0), 
				Arguments.of(66, 'F', false, 0),
				Arguments.of(Integer.MAX_VALUE, 'M', false, 0), 
				Arguments.of(66, 'G', false, 0));
	}
}
