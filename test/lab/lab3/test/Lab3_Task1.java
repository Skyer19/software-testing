package lab.lab3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lab.lab3.*;

public class Lab3_Task1 {
//	Lab3_Program1 lp = new Lab3_Program1();
	Lab3_Program1_Fix lp = new Lab3_Program1_Fix();

	@DisplayName("Lab3_Task1")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void bv_test(boolean sportsEquipment, boolean musicEquipment,int fee) {
		assertEquals(lp.calcInsurance(sportsEquipment, musicEquipment), fee);
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(true,true,"20"), 
				Arguments.of(true,false,"10"), 
				Arguments.of(false,true,"10"), 
				Arguments.of(false,false,"5")
				);

	}
}
