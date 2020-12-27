package lab.lab6.test;

	import static org.junit.jupiter.api.Assertions.assertEquals;

	import java.util.stream.Stream;

	import org.junit.jupiter.api.DisplayName;
	import org.junit.jupiter.params.ParameterizedTest;
	import org.junit.jupiter.params.provider.Arguments;
	import org.junit.jupiter.params.provider.MethodSource;

	import lab.lab6.*;

	public class Lab6_Task4 {
		Lab6_Program1 lp = new Lab6_Program1();

		@DisplayName("Lab6_Task")
		@ParameterizedTest(name = "{index} {0} {1} {2}")
		@MethodSource("parameterDataProvider")
		void bv_test(int miles, int months, int runHours,boolean serviceNeeded) {
			assertEquals(serviceNeeded, lp.engineService(miles,months,runHours ));
		}

		private static Stream<Arguments> parameterDataProvider() {
			return Stream.of(
					Arguments.of(16000,6,2000,true), 
					Arguments.of(16000,6, 500,false),
					Arguments.of(13000, 6,2000,false));
		}
	}