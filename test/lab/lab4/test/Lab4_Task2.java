package lab.lab4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab4.*;

public class Lab4_Task2 {
//	Lab4_Program2 lp = new Lab4_Program2();
	Lab4_Program2_Fix lp = new Lab4_Program2_Fix();

	@DisplayName("Lab4_Task2")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void bv_test(int exam, int course,String result) {
		assertEquals(lp.grade(exam, course), result);
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(	
				Arguments.of(-10, -10,"Marks out of range"), 
				Arguments.of(25, 25,"Fail"),
				Arguments.of(55, 55,"Pass,C"), 
				Arguments.of(80, 80,"Pass,A"), 
				Arguments.of(65, 55,"Pass,B")
				);

	}
}
