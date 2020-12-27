package lab.lab1;

public class Lab1_Program2_Fix {

	public static String grade(int exam, int course) {

		String result = "null";
		long average;
		average = Math.round((exam + course) / 2);

		if ((exam < 0) || (exam > 100) || (course < 0) || (course > 100)) {
			result = "Marks out of range";
		} else {
			if (exam < 60 && exam >= 50 && course >= 50) { // fixed here
				result = "Pass,C";
			} else if ((exam < 50) || (course < 50)) {
				result = "Fail";
			} else if (average >= 70) { // fixed here
				result = "Pass,A";
			} else {
				result = "Pass,B";
			}
		}

		return result;

	}

}
