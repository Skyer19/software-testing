package tutorial.tutorial4.test.randomtesting.test;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import tutorial.tutorial4.common.Status;
import tutorial.tutorial4.randomtesting.FlightSeatFit;


class RndTestFit {
	FlightSeatFit fsf = new FlightSeatFit();
	static Random rnd = new Random();

	@DisplayName("Rnd Test fit")
	@ParameterizedTest(name = "{index} {0} {1} {2}")
	@MethodSource("parameterDataProvider")
	void bv_test(int passengers, boolean comfortFlag, Status status) {
		assertEquals(status, fsf.fit(passengers, comfortFlag));
	}

	private static Object[] genTestData() {
		// Select a return value at random; 0:SUCCESS, 1:FAILURE, 2:ERROR
		int passengers = 0;
		boolean comfortFlag = false;
		String status = null;
		Object[] record = new Object[3];

		switch (rnd.nextInt(3)) {//rnd.nextInt(3) 璇ュ�间粙浜嶽0,3)鐨勫尯闂�
		case 0:
			switch (rnd.nextInt(2)) { // comfortFlag; 0:true, 1:false
			case 0:
				passengers = rnd.nextInt(80) + 1;
				comfortFlag = true;
				break;
			case 1:
				passengers = rnd.nextInt(120) + 1;
				comfortFlag = false;
				break;
			}
			status = "SUCCESS";
			break;
		case 1:
			switch (rnd.nextInt(2)) {
			case 0:
				passengers = rnd.nextInt(Integer.MAX_VALUE - 80) + 81;
				comfortFlag = true;
				break;
			case 1:
				passengers = rnd.nextInt(Integer.MAX_VALUE - 120) + 121;
				comfortFlag = false;
				break;
			}
			status = "FAILURE";
			break;
		case 2:
			passengers = -rnd.nextInt(Integer.MAX_VALUE);
			comfortFlag = rnd.nextBoolean();
			status = "ERROR";
			break;
		}
		record[0] = passengers;
		record[1] = comfortFlag;
		record[2] = status;

		return record;
	}

	private static Stream<Object[]> parameterDataProvider() {
		int numTestCases = 20;
		Object[][] args = new Object[numTestCases][3];
		IntStream.range(0, numTestCases).forEach(i -> args[i] = genTestData());
		return Stream.of(args);
	}
}