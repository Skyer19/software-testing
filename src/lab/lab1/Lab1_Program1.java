package lab.lab1;

public class Lab1_Program1 {
	public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
		int fee = 5;

		if (sportsEquipment || musicEquipment)
			fee = 10;
		else if (sportsEquipment && musicEquipment)
			fee = 20;

		return fee;
	}
}
