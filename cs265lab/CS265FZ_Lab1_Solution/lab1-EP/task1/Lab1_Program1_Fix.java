package edu.dapeng.st.lab;

public class Lab1_Program1_CORRECT {
	public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
		int fee = 5;
		if(sportsEquipment && musicEquipment)		//fix: if and else if are swapped
			fee = 20;
		else if(sportsEquipment || musicEquipment)
			fee = 10;
		
		return fee;
	}

}
