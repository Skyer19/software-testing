import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab2_Task2 {

	Lab1_Program2 p1 = new Lab1_Program2();
	@DisplayName("EC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void ecTest(String id, int exam, int course, String result) {
		assertEquals(result, p1.grade(exam, course));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of("T1.1", 0, 50, "Fail"), 
				Arguments.of("T1.2", 49, 50, "Fail"), 
				Arguments.of("T1.3", 50, 50, "Pass,C"),
				Arguments.of("T1.4", 59, 50, "Pass,C"), 
				Arguments.of("T1.5", 60, 50, "Pass,B"), 
				Arguments.of("T1.6", 100, 50, "Pass,A"),
				Arguments.of("T1.7", 50, 0, "Fail"), 
				Arguments.of("T1.8", 50, 49, "Fail"), 
				Arguments.of("T1.9", 50, 50, "Pass,C"),
				Arguments.of("T1.10", 60, 100, "Pass,A"), 
				Arguments.of("T1.11", Integer.MIN_VALUE, 50, "Marks out of range"), 
				Arguments.of("T1.12", -1, 50, "Marks out of range"),
				Arguments.of("T1.13", 101, 50, "Marks out of range"), 
				Arguments.of("T1.14", Integer.MAX_VALUE, 50, "Marks out of range"), 
				Arguments.of("T1.15", 50, Integer.MIN_VALUE, "Marks out of range"),
				Arguments.of("T1.16", 50, -1, "Marks out of range"), 
				Arguments.of("T1.17", 50, 101, "Marks out of range"), 
				Arguments.of("T1.18", 50, Integer.MAX_VALUE, "Marks out of range"));
	}

}
