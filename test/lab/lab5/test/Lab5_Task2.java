package lab.lab5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab5.*;

public class Lab5_Task2 {
//	Lab5_Program2 lp = new Lab5_Program2();
	Lab5_Program2_Fix lp =new Lab5_Program2_Fix();

	@DisplayName("Lab5_Task1")
	@ParameterizedTest(name = "{index} {0} {1} {2}")
	@MethodSource("parameterDataProvider")
	void bv_test(int age, char OS,int p) {
		assertEquals(p, lp.phoneInsurance(age,OS));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(12,  'B', 0), 
				Arguments.of(20,  'I', 75),
				Arguments.of(55,  'A', 40), 
				Arguments.of(30,  'I', 50),
				Arguments.of(63,  'A', 45));
	}
}