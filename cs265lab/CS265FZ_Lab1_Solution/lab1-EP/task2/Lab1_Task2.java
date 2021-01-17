import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab1_Task2 {

	Lab1_Program2 p1 = new Lab1_Program2();
	@DisplayName("EC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void ecTest(String id, int exam, int course, String result) {
		assertEquals(result, p1.grade(exam, course));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of("T1.1",25, 55, "Fail"), 
				Arguments.of("T1.2",55, 40, "Fail"), 
				Arguments.of("T1.3",55, 50, "Pass,C"),
				Arguments.of("T1.4",80, 50, "Pass,B"), 
				Arguments.of("T1.5",90, 50, "Pass,A"), 
				Arguments.of("T1.6",-500, 55, "Marks out of range"),
				Arguments.of("T1.7",500, 55, "Marks out of range"), 
				Arguments.of("T1.8",55, -500, "Marks out of range"), 
				Arguments.of("T1.9",55, 500, "Marks out of range"));
	}

}
