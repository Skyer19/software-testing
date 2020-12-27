package lab.lab3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab3.*;

public class Lab3_Task2 {
	
//	Lab3_Program2 lp = new Lab3_Program2();
	Lab3_Program2_Fix lp = new Lab3_Program2_Fix();

	@DisplayName("Lab3_Task2")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void bv_test(int purchase,double dc) {
		assertEquals(lp.discount(purchase), dc,1.0E-6);
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(600,0.15),
				Arguments.of(300,0.1), 
				Arguments.of(100,0.05), 	
				Arguments.of(30,0)
				);

	}
}
