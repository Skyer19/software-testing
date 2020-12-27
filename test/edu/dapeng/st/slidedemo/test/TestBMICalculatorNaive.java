package edu.dapeng.st.slidedemo.test;

import edu.dapeng.st.slidedemo.BMICalculator;

public class TestBMICalculatorNaive {

	public static void main(String[] args) {
		BMICalculator bc = new BMICalculator();
		System.out.println("Test case EC-1:");
		if (bc.calcBMI(9) == BMICalculator.BMI_CATEGORY.UNDERWEIGHT)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");

		System.out.println("Test case EC-2:");
		if (bc.calcBMI(22) == BMICalculator.BMI_CATEGORY.HEALTHY)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");

		System.out.println("Test case EC-3:");
		if (bc.calcBMI(27) == BMICalculator.BMI_CATEGORY.OVERWEIGHT)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");

		System.out.println("Test case EC-4:");
		if (bc.calcBMI(35) == BMICalculator.BMI_CATEGORY.OBESE)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");

		System.out.println("Test case EC-5:");
		if (bc.calcBMI(50) == BMICalculator.BMI_CATEGORY.EXTREMELY_OBESE)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");

		System.out.println("Test case EC-6:");
		if (bc.calcBMI(-1) == BMICalculator.BMI_CATEGORY.INVALID)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");
	}

}
