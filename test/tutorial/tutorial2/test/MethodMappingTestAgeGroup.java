package tutorial.tutorial2.test;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import tutorial.tutorial2.*;

class MethodMappingTestAgeGroup {
	AgeGroups ageGroups = new AgeGroups();

	@DisplayName("BV Test")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void test_bv_2_to_14(int age, MyAgeGroup group) {
		assertEquals(group, ageGroups.findAgeGroup(age));
	}

	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(0, "BABY"), Arguments.of(2, "BABY"), 
				Arguments.of(3, "CHILD"), Arguments.of(16, "CHILD"), 
				Arguments.of(17, "YOUNG_ADULT"), Arguments.of(30, "YOUNG_ADULT"),
				Arguments.of(31, "MIDDLE_AGED_ADULT"), Arguments.of(45, "MIDDLE_AGED_ADULT"),
				Arguments.of(46, "OLD_ADULT"), Arguments.of(150, "OLD_ADULT"), 
				Arguments.of(Integer.MIN_VALUE, "ERROR"),
				Arguments.of(-1, "ERROR"), 
				Arguments.of(151, "ERROR"), 
				Arguments.of(Integer.MAX_VALUE, "ERROR"));
	}
}

