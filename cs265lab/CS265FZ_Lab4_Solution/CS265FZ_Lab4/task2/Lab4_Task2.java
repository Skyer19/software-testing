package edu.dapeng.st.lab4;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab4_Task2 {

	Lab4_Program2_Fix p1 = new Lab4_Program2_Fix();

	@DisplayName("SC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void ecTest(String id, int exam, int course, String result) {
		assertEquals(result, p1.grade(exam, course));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of("T1.1", -100, 55, "Marks out of range"), Arguments.of("T1.2", 25, 55, "Fail"),
				Arguments.of("T1.3", 55, 55, "Pass,C"), Arguments.of("T1.4", 90, 55, "Pass,A"),
				Arguments.of("T1.5", 65, 55, "Pass,B"));

	}

}
