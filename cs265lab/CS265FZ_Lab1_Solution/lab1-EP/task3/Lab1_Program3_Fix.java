public class Lab1_Program3 {
	
	 public static int CarIns (int age, char gender, boolean married) {

		 int premium;
		 //if invalid age or gender
		 if ((age<16) || (age>65) || (gender!='M' && gender!='F'))
		                premium=0;
		 else {
		             premium=500;
		             //if under 25
		             if ((age<25) && (gender=='M') && (!married))	//fix: it should be if ((age<25) && (gender=='M') && (!married)) 
		                           premium += 1500;
                    else {
                   	 //if over 25
		                 if (married || gender=='F')
      		                     premium -= 200;
		                 if ((age>=45) && (age<=65)) 
		                   premium -= 100;
		                 }
		       }
		 return premium;	 
    }
}
