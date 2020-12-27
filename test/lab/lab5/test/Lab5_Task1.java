package lab.lab5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab5.*;

public class Lab5_Task1 {
//	Lab5_Program1 lp = new Lab5_Program1();
	Lab5_Program1_Fix lp =new Lab5_Program1_Fix();

	@DisplayName("Lab5_Task1")
	@ParameterizedTest(name = "{index} {0} {1} {2}")
	@MethodSource("parameterDataProvider")
	void bv_test(int age, boolean single,int taxRelief) {
		assertEquals(taxRelief, lp.taxRelief(age,single));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(16,  true, 0), 
				Arguments.of(33,  true, 800),
				Arguments.of(66,  true, 1600), 
				Arguments.of(66,  false, 3200),
				Arguments.of(40,  false, 1600));
	}
}

