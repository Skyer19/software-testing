import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab1_Task3 {

	Lab1_Program3 p1 = new Lab1_Program3();
	@DisplayName("EC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void ecTest(String id, int age, char gender, boolean married, int result) {
		assertEquals(result, p1.CarIns(age, gender, married));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of("T1.1", 50, 'F', true, 200), 
				Arguments.of("T1.2", 35, 'F', false, 300), 
				Arguments.of("T1.3", 50, 'M', false, 400),
				Arguments.of("T1.4", 35, 'M', false, 500), 
				Arguments.of("T1.5", 20, 'M', false, 2000), 
				Arguments.of("T1.6", 10, 'M', false, 0),
				Arguments.of("T1.7", 100, 'M', false, 0), 
				Arguments.of("T1.8", 20, 'G', false, 0));
	}

}
