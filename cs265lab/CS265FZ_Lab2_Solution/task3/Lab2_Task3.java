import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab2_Task3 {

	Lab2_Program3 p1 = new Lab2_Program3();
	@DisplayName("EC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void ecTest(String id, int age, char gender, boolean married, int result) {
		assertEquals(result, p1.CarIns(age, gender, married));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of("T1.1", 45, 'F', true, 200), 
				Arguments.of("T1.2", 25, 'F', true, 300), 
				Arguments.of("T1.3", 65, 'M', false, 400),
				Arguments.of("T1.4", 44, 'M', false, 500), 
				Arguments.of("T1.5", 24, 'M', false, 2000), 
				Arguments.of("T1.6", 16, 'M', false, 2000),
				Arguments.of("T1.7", Integer.MIN_VALUE, 'M', false, 0), 
				Arguments.of("T1.8", 15, 'M', false, 0),
				Arguments.of("T1.9", 66, 'M', false, 0), 
				Arguments.of("T1.10", Integer.MAX_VALUE, 'M', false, 0), 
				Arguments.of("T1.11", 25, 'G', false, 0));
				
	}

}
