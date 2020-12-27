package COMPUTER_BASED_TEST;

public class CouponValue_Fixed {
	public int getCouponValue(final boolean useClubcard, final int purchaseTotal) {
		int couponValue;
		if (purchaseTotal <= 0) {
			couponValue = -1;
		} else {
			couponValue = 5;
			if (purchaseTotal <= 25) {
				if (useClubcard)
					/*
					 * if (!useClubcard) ----->if (useClubcard)
					 */
					couponValue += 2;
			} else {
				couponValue += 5;
				if (purchaseTotal > 50 && useClubcard)
					couponValue += 4;
			}
		}
		return couponValue;
	}
}
