package tutorial.tutorial4.test.randomtesting.test;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import tutorial.tutorial4.common.Gender;
import tutorial.tutorial4.randomtesting.HeightValidator;


class RndTestHeightValidator {
	HeightValidator hv = new HeightValidator();
	private static Random rnd = new Random();

	@DisplayName("Rnd Test Height Validator")
	@ParameterizedTest(name = "{index} {0} {1} {2}")
	@MethodSource("parameterDataProvider")
	void bv_test(int height, Gender gender, boolean valid) {
		assertEquals(valid, hv.validateHeight(height, gender));
	}

	private static int genRndHeightNormalDist(Gender gender) {
		double rndNum = 0.0;
		switch (gender) {
		case FEMALE:
			rndNum = rnd.nextGaussian() * 7.07 + 164.7; // Actual values refer to the lecture notes
			if(rndNum < 140)
				rndNum = 140;
			else if (rndNum > 190) 
				rndNum = 190; 
			break;
		case MALE:
			rndNum = rnd.nextGaussian() * 7.59 + 178.4; // Actual values refer to the lecture notes
			if (rndNum < 150 )
				rndNum = 150;
			else if(rndNum > 210)
				rndNum = 210;
		}

		return (int) Math.floor(rndNum);
	}

	private static int genRndHeightUniformDist(Gender gender) {
		int rndNum = 0;
		// true: left, false: right
		if (rnd.nextBoolean()) {
			rndNum = -(rnd.nextInt(Integer.MAX_VALUE));
			switch (gender) {
			case FEMALE:
				if (rnd.nextBoolean()) // toss a coin to do the shift
					rndNum += 149;
			case MALE:
				if (rnd.nextBoolean()) // toss a coin to do the shift
					rndNum += 139;
			}
		} else {
			switch (gender) {
			case FEMALE:
				rndNum = Math.abs(rnd.nextInt(Integer.MAX_VALUE) + 191);
			case MALE:
				rndNum = Math.abs(rnd.nextInt(Integer.MAX_VALUE) + 211);
			}
		}

		return rndNum;
	}

	private static Object[] genTestData() {
		int height = 0;
		Gender gender = Gender.MALE;
		boolean valid = false;
		Object[] record = new Object[3];

		// true: valid, false: invalid
		if (rnd.nextBoolean()) {
			valid = true;
			// true: FEMALE, false MALE
			if (rnd.nextBoolean()) {
				height = genRndHeightNormalDist(Gender.FEMALE);
				gender = Gender.FEMALE;
			} else {
				height = genRndHeightNormalDist(Gender.MALE);
			}
		} else {
			if (rnd.nextBoolean()) {
				height = genRndHeightUniformDist(Gender.FEMALE);
				gender = Gender.FEMALE;
			} else {
				height = genRndHeightUniformDist(Gender.MALE);
			}
		}

		record[0] = height;
		record[1] = gender;
		record[2] = valid;

		return record;
	}

	private static Stream<Object[]> parameterDataProvider() {
		int numTestCases = 100;
		Object[][] args = new Object[numTestCases][3];
		IntStream.range(0, numTestCases).forEach(i -> args[i] = genTestData());
		return Stream.of(args);
	}

}
