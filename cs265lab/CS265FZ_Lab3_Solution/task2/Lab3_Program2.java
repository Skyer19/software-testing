package edu.dapeng.st.lab3;

public class Lab3_Program2 {

	public double discount(int purchase) {

		double dc = 0;

		if (purchase <= 0)
			dc = 0;
		else if ((purchase >= 1) && (purchase <= 50))
			dc = 0;
		else if (purchase <= 200)
			dc = 0.05;
		else if (purchase <= 500)
			dc = 0.1;
		else
			dc = 2.5;

		return dc;
	}
}