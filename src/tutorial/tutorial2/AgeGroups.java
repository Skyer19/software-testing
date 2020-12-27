package tutorial.tutorial2;

public class AgeGroups {
	public MyAgeGroup findAgeGroup(int age) {
		MyAgeGroup ageGroup = MyAgeGroup.ERROR;
		if (age >= 0 && age <= 2)   
			/*
			 * age >= 0 && age <= 3 -----> age >= 0 && age <= 2
			 */
			ageGroup = MyAgeGroup.BABY;
		else if (age >= 3 && age < 17)
			ageGroup = MyAgeGroup.CHILD;
		else if (age >= 17 && age < 31)
			ageGroup = MyAgeGroup.YOUNG_ADULT;
		else if (age >= 31 && age < 46)
			ageGroup = MyAgeGroup.MIDDLE_AGED_ADULT;
		else if (age >= 46 && age <= 150)
			/*
			 * (age > 46 && age <= 150) ------> (age >= 46 && age <= 150)
			 */
			ageGroup = MyAgeGroup.OLD_ADULT;
		return ageGroup;
	}
}
