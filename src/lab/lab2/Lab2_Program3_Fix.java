package lab.lab2;

public class Lab2_Program3_Fix {

	public static int CarIns(int age, char gender, boolean married) {

		int premium;
		if ((age < 16) || (age > 65) || (gender != 'M' && gender != 'F'))
			/*
			 * premium=10000; 
			 * 10000 ----> 0 
			 * If the age entered is less than 16 or greater than
			 * 65, the program returns a premium of zero
			 */
			premium = 0;
		else {
			premium = 500;
			if ((age < 25) && (gender == 'M') && (!married))
				premium += 1500;
			else {
				if (married || gender == 'F')
					premium -= 200;
				if ((age >= 45) && (age <= 65))
					premium -= 100;
			}
		}
		return premium;
	}
}
