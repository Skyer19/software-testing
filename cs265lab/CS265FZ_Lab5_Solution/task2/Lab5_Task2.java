package edu.dapeng.st.lab5;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab5_Task2 {

	Lab5_Program2 p1 = new Lab5_Program2();

	@DisplayName("BC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void scTest(String id, int age, char OS, int result) {
		assertEquals(result, p1.phoneInsurance(age, OS));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of("T1.1", 10, 'I', 0), Arguments.of("T1.2", 20, 'I', 75),
				Arguments.of("T1.3", 50, 'A', 40), Arguments.of("T1.4", 63, 'A', 45),
				Arguments.of("T1.5", 30, 'A', 50));
	}
}