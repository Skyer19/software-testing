package COMPUTER_BASED_TEST.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import COMPUTER_BASED_TEST.*;

class Test_CouponValue {

	// START (Equivalence Class Testing)
//	CouponValue cv = new CouponValue();
	CouponValue_Fixed cv = new CouponValue_Fixed();

	@DisplayName("EC Test")
	@ParameterizedTest()
	@MethodSource("ec_DataProvider")
	void ec_test(int purchaseTotal, boolean useClubcard, int couponValue) {
		assertEquals(couponValue, cv.getCouponValue(useClubcard, purchaseTotal));
	}

	private static Stream<Arguments> ec_DataProvider() {
		return Stream.of(
				Arguments.of(-10,true,-1), 
				Arguments.of(12,false,5), 
				Arguments.of(12,true,7), 
				Arguments.of(40,false,10), 
				Arguments.of(60,true,14)
				);
	}
//END (Equivalence Class Testing)
}
