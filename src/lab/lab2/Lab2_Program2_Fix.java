package lab.lab2;

public class Lab2_Program2_Fix {

	public static String grade(int exam, int course) {

		String result = "null";
		long average;
		average = Math.round((exam + course) / 2);

		if ((exam < 0) || (exam > 100) || (course < 0) || (course > 100))
			result = "Marks out of range";
		else {
			if ((exam < 50) || (course < 50)) {

				/*
				 * delete result="Pass,C"; 
				 * If the exam or course work mark is less than 50% then
				 * the grade returned is a ¡®Fail¡¯
				 */
				result = "Fail";

			} else if (exam < 60) {
				/*
				 * delete result="Fail"; 
				 * To pass the course with a ¡®Pass, C¡¯, the student must
				 * score between 50% and 60% in the exam, and at least 50% in the course work.
				 */
				result = "Pass,C";
			} else if (average >= 70) {
				/*
				 * 80---->70 
				 * if the average of the exam and the course work is at least 70%, then
				 * they are awarded a ¡®Pass, A¡¯
				 */
				result = "Pass,A";
			} else {
				result = "Pass,B";
			}
		}

		return result;

	}
}
