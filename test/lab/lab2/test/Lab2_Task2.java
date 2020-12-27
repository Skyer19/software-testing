package lab.lab2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab2.*;

public class Lab2_Task2 {
//	Lab2_Program2 lp = new Lab2_Program2();
	Lab2_Program2_Fix lp = new Lab2_Program2_Fix();

	@DisplayName("Lab2_Task2")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void bv_test(int exam, int course,String result) {
		assertEquals(lp.grade(exam, course), result);
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(Integer.MIN_VALUE, Integer.MIN_VALUE,"Marks out of range"), 
				Arguments.of(-1, -1,"Marks out of range"), 
				Arguments.of(0, 0,"Fail"), 
				Arguments.of(49, 49,"Fail"),
				Arguments.of(50, 50,"Pass,C"), 
				Arguments.of(59, 50,"Pass,C"), 
				Arguments.of(60, 50,"Pass,B"),
				Arguments.of(100, 100,"Pass,A"),
				Arguments.of(101, 101,"Marks out of range"),
				Arguments.of(Integer.MIN_VALUE, Integer.MIN_VALUE,"Marks out of range")
				);

	}
}
