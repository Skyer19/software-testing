package edu.dapeng.st.lab4;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab4_Task1 {

	Lab4_Program1_Fix p1 = new Lab4_Program1_Fix();

	@DisplayName("SC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void scTest(String id, int age, char gender, boolean married, int result) {
		assertEquals(result, p1.carInsurance(age, gender, married));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of("T1.1", 10, 'M', false, 0), Arguments.of("T1.2", 20, 'M', false, 2000),
				Arguments.of("T1.3", 50, 'F', false, 200));
	}
}