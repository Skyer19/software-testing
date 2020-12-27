package lab.lab3;

public class Lab3_Program1_Fix {
	
	public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
		int fee = 5; 
		/*
		 *  fee = 25 -----> fee = 5
		 *  Because this value is initialized with the following conditions:
		 *  If they bring no equipment, then the insurance fee is ву5
		 */

		if (sportsEquipment && musicEquipment)
			fee = 20;
		else if (sportsEquipment || musicEquipment)
			fee = 10;

		return fee;
	}
}
