package edu.dapeng.st.lab3;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Lab3_Task1 {
	Lab3_Program1 p1 = new Lab3_Program1();

	@DisplayName("Combinational Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void ecTest(String id, boolean sportsEquipment, boolean musicEquipment, int fee) {
		assertEquals(fee, p1.calcInsurance(sportsEquipment, musicEquipment));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(Arguments.of("T1.1", true, true, 20), Arguments.of("T1.2", true, false, 10),
				Arguments.of("T1.3", false, true, 10), Arguments.of("T1.4", false, false, 5));
	}

}
