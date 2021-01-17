package edu.dapeng.st.lab5;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab5_Task1 {

	Lab5_Program1_Fix p1 = new Lab5_Program1_Fix();

	@DisplayName("BC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void scTest(String id, int age, boolean single, int result) {
		assertEquals(result, p1.taxRelief(age, single));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of("T1.1", 10, true, 0), Arguments.of("T1.2", 30, true, 800),
				Arguments.of("T1.3", 60, true, 1600), Arguments.of("T1.4", 30, false, 1600),
				Arguments.of("T1.5", 60, false, 3200));
	}
}