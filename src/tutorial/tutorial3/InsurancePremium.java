package tutorial.tutorial3;

public class InsurancePremium {
	public int calcPremium(int age, char gender, boolean married) {
		int premium;
		if ((age < 16) || (age > 65) || (gender != 'M' && gender != 'F')) {
			premium = 0;
		} else {
			premium = 500;
			if ((age < 25) && (gender == 'M') && !married) {
				// if ((age < 25) && (gender == 'M')) { // missing "&& !married, EC pass, BV:
				// pass, CombT: fail
				premium += 1500;
			} else {
				if (married || gender == 'F')
					premium -= 200;
				if (age >= 45) // 45 -> 46, BV fail
					premium -= 100;
			}
		}
		return premium;
	}
}
