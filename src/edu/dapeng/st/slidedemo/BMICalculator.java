package edu.dapeng.st.slidedemo;

public class BMICalculator {
	static public enum BMI_CATEGORY {
		UNDERWEIGHT, HEALTHY, OVERWEIGHT, OBESE, EXTREMELY_OBESE, INVALID;
	}

	public BMI_CATEGORY calcBMI(double score) {
		score = Math.round(score * 10.0) / 10.0;
		BMI_CATEGORY category = BMI_CATEGORY.INVALID;
		if (score > 0 && score < 18.5)
			category = BMI_CATEGORY.UNDERWEIGHT;
		else if (score >= 18.5 && score < 25)
			category = BMI_CATEGORY.HEALTHY;
		else if (score >= 25 && score < 30)
			category = BMI_CATEGORY.OVERWEIGHT;
		else if (score >= 30 && score < 40)
			category = BMI_CATEGORY.OBESE;
		else if (score >= 40)
			category = BMI_CATEGORY.EXTREMELY_OBESE;

		return category;

	}

	public static void main(String[] args) {
		BMICalculator bc = new BMICalculator();
		System.out.println(bc.calcBMI(18.43).toString());
	}

}
