package tutorial.tutorial4.randomtesting;

import tutorial.tutorial4.common.Gender;

public class HeightValidator {
	public boolean validateHeight(int height, Gender gender) {
		boolean valid = false;
		switch (gender) {
		case MALE:
			if (height >= 150 && height <= 210)
				valid = true;
			break;
		case FEMALE:
			if (height >= 140 && height <= 190)
				valid = true;
		}
		
		return valid;
	} 
}
