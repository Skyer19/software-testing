import static org.junit.Assert.assertEquals;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab2_Task1 {

	Lab2_Program1 p1 = new Lab2_Program1();
	@DisplayName("EC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void ecTest(String id, int purchase, double result) {
		assertEquals(result, p1.discount(purchase));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of("T1.1", 1, 0),
				Arguments.of("T1.2", 50, 0), 
				Arguments.of("T1.3", 51, 0.05),
				Arguments.of("T1.4", 200, 0.05), 
				Arguments.of("T1.5", 201, 0.1), 
				Arguments.of("T1.6", 500, 0.1),
				Arguments.of("T1.7", 501, 1.5), 
				Arguments.of("T1.8", Integer.MAX_VALUE, 1.5),
				Arguments.of("T1.9", Integer.MIN_VALUE, 0), 
				Arguments.of("T1.10", 0, 0));
				
	}

}

