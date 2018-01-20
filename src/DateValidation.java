import java.text.ParseException;

public class DateValidation extends DateFormatCheck{
	
	private static boolean dateValidationResult;
	
	DateValidation() throws ParseException{
		
		System.out.println("Month : "+ month);
		System.out.println("Day : "+ day);
		System.out.println("Year : "+ year);
		
		dateValidationResult = validateYear();
		if(dateValidationResult)
			dateValidationResult = validateMonth();
		if(dateValidationResult)
			dateValidationResult = validateDay();
		
		System.out.println("Validate Result : " + dateValidationResult);
		if(dateValidationResult){
			Terminate.count = 0;  // for consecutive 3 times check
			DayOfWeek.getDayOfWeek(); //Call Day of the Week Class
			ZodiacSign.getZodiacSign(); //Call Zodiac Sign Class
			
		}else{
			Terminate.checkTermination(); //call terminate class
		}
	}

	private boolean validateYear() {
		return (0000 <= year && year <= 2017)? true : false;
	}
	private boolean validateMonth() {
		return (1 <= month && month <= 12)? true : false;
	}
	private boolean validateDay() {
		switch(month){
	    case 1 : 
	    	return (1 <= day && day <= 31)? true : false;
	    case 2:
	    	if(year%4 == 0){
	    		return (1 <= day && day <= 29)? true : false; //Leap Year 
	    	}else{
	    		return (1 <= day && day <= 28)? true : false; //Not a Leap Year 		
	    	}
	    case 3:
	    	return (1 <= day && day <= 31)? true : false;
	    case 4:
	    	return (1 <= day && day <= 30)? true : false;
	    case 5:
	    	return (1 <= day && day <= 31)? true : false;
	    case 6:
	    	return (1 <= day && day <= 30)? true : false;
	    case 7:
	    	return (1 <= day && day <= 31)? true : false;
	    case 8:
	    	return (1 <= day && day <= 31)? true : false;
	    case 9:
	    	return (1 <= day && day <= 30)? true : false;
	    case 10:
	    	return (1 <= day && day <= 31)? true : false;
	    case 11:
	    	return (1 <= day && day <= 30)? true : false;
	    case 12:
	    	return (1 <= day && day <= 31)? true : false;
		}
		return false;
	}
}
