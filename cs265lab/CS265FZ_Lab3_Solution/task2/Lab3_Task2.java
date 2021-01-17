package edu.dapeng.st.lab3;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab3_Task2 {
	final double EPSILON = 1E-6;

	Lab3_Program2 p2 = new Lab3_Program2();

	@DisplayName("Combinational Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void ecTest(String id, int purchase, double result) {
		assertEquals(result, p2.discount(purchase), EPSILON);
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of("T1.1", 600, 0.15), Arguments.of("T1.2", 300, 0.1),
				Arguments.of("T1.3", 75, 0.05), Arguments.of("T1.4", 25, 0));

	}

}
