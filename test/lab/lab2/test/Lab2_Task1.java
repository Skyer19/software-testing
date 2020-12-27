package lab.lab2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab2.*;

public class Lab2_Task1 {
//	Lab2_Program1 lt = new Lab2_Program1();
	Lab2_Program1_Fix lt = new Lab2_Program1_Fix();

	@DisplayName("Lab2_Task1")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void bv_test(int purchase, double discount) {
		assertEquals(lt.discount(purchase), discount,0.001);
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(1, 0), Arguments.of(50, 0), 
				Arguments.of(51, 0.05), 
				Arguments.of(200, 0.05),
				Arguments.of(201, 0.1), 
				Arguments.of(500, 0.1), 
				Arguments.of(Integer.MIN_VALUE, 0),
				Arguments.of(Integer.MIN_VALUE, 0)
				);

	}
}