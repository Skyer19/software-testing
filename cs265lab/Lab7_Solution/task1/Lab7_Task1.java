package edu.dapeng.st.lab7;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab7_Task1 {

	Lab7_Program1 p1 = new Lab7_Program1();

	@DisplayName("PC Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void scTest(String id, int quantity, boolean credit, int inventory, String output) {
		assertEquals(output, p1.orderScreening(quantity, credit, inventory));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of("T1.1", 2000, false, 0, "Reject"), Arguments.of("T1.2", 500, true, 700, "Accept"),
				Arguments.of("T1.3", 500, true, 300, "Defer"));
	}
}