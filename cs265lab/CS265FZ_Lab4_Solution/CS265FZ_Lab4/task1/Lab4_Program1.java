package edu.dapeng.st.lab4;

public class Lab4_Program1 {

	public int carInsurance(int age, char gender, boolean married) {

		int premium;
		if ((age < 16) || (age > 65) || (gender != 'M' && gender != 'F'))
			premium = 0;
		else {
			premium = 500;
			if ((age < 25) && (gender == 'M') && (!married))
				premium += 1500;
			else {
				if (married || gender == 'F')
					premium -= 200;
				if (age >= 45)
					premium -= 100;
			}
		}
		return 0;
	}
}
