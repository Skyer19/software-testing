package lab.lab7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab7.*;

public class Lab7_Task1 {
	Lab7_Program1 lp = new Lab7_Program1();

	@DisplayName("Lab7_Task1")
	@ParameterizedTest(name = "{index} {0} {1} {2}")
	@MethodSource("parameterDataProvider")
	void bv_test(int quantity, boolean credit, int inventory,String output) {
		assertEquals(output, lp.orderScreening(quantity,credit,inventory ));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(500,true,700,"Accept"), 
				Arguments.of(500,true, 300,"Defer"),
				Arguments.of(2000, false,200,"Reject"));
	}
}
