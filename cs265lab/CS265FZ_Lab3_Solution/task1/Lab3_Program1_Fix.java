package edu.dapeng.st.lab3;

public class Lab3_Program1_Fix {
	public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
		int fee = 5; // fix: int fee=5;

		if (sportsEquipment && musicEquipment)
			fee = 20;
		else if (sportsEquipment || musicEquipment)
			fee = 10;

		return fee;
	}

}
