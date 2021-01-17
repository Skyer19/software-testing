package edu.dapeng.st.lab6;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab6_Task4 {
	Lab6_Program1 p1 = new Lab6_Program1();

	@DisplayName("CC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void scTest(String id, int miles, int runHours, int months, boolean serviceNeeded) {
		assertEquals(serviceNeeded, p1.engineService(miles, months, runHours));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of("T1.1", 18000, 2000, 6, true), Arguments.of("T1.2", 7000, 500, 6, false),
				Arguments.of("T1.3", 7000, 2000, 6, false), Arguments.of("T1.4", 18000, 500, 6, false));
	}
}