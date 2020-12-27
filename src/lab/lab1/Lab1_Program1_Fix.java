package lab.lab1;

public class Lab1_Program1_Fix {

	public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
		int fee = 5;

		if ((sportsEquipment == true && musicEquipment == false)
				|| ((sportsEquipment == false && musicEquipment == true))) {
			fee = 10;
		} else if (sportsEquipment == true && musicEquipment == true) {
			fee = 20;
		}
		return fee;
	}

}
