package lab.lab4.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab4.*;

class Lab4_Task1 {
//	Lab4_Program1 lp = new Lab4_Program1();
	Lab4_Program1_Fix lp =new Lab4_Program1_Fix();

	@DisplayName("Lab4_Task1")
	@ParameterizedTest(name = "{index} {0} {1} {2}")
	@MethodSource("parameterDataProvider")
	void bv_test(int age, char gender, boolean married, int premium) {
		assertEquals(premium, lp.carInsurance(age, gender, married));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(15, 'M', true, 0), 
				Arguments.of(22, 'M', false, 2000),
				Arguments.of(50, 'F', true, 200));
	}
}
