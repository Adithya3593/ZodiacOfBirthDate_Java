import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class DateFormatCheck {
	
	protected static String inputDob;
	protected static int day;
	protected static int month;
	protected static int year;
	
	DateFormatCheck(){
		
	}
	
	DateFormatCheck(String inputDate) throws ParseException {
		
		inputDob = inputDate;
		boolean isCorrectFormat = checkFormat();
		
		if(isCorrectFormat){
			 //call the ValidateDate class constructor by  passing the day, month & year values
			 dateSplit();
			 new DateValidation();
		 }
		else{
			 //call the Terminate class
			System.out.println("Terminate Class");
			Terminate.checkTermination();
		 }
		
	}
	
	private void dateSplit() {
		
		List<String> inputDateSplit = Arrays.asList(inputDob.split("/"));
		
		for(int j = 0; j < inputDateSplit.size(); j++) {   
			if(j==0){				
				month = Integer.parseInt(inputDateSplit.get(j));
				//System.out.println("Month : "+ inputDateSplit.get(j));
			}else if(j==1){
				day = Integer.parseInt(inputDateSplit.get(j));		
				//System.out.println("Day : "+ inputDateSplit.get(j));
			}else{
				year = Integer.parseInt(inputDateSplit.get(j));
				//System.out.println("Year : "+ inputDateSplit.get(j));
			}
		    
		}
	}

	private boolean checkFormat(){
		
		if(inputDob.length() != 10){
			System.out.println("Invalid date format length : " + inputDob.length()); // call the terminate class
    		return false;
		}
			
		for(int i = 0; i < inputDob.length(); i++) {
			switch(i){
		    case 0 : 
		    	if(Character.isDigit(inputDob.charAt(i))){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    case 1 : 
		    	if(Character.isDigit(inputDob.charAt(i))){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    case 2 : 
		    	if (inputDob.charAt(i) == '/'){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    case 3 : 
		    	if(Character.isDigit(inputDob.charAt(i))){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    case 4 : 
		    	if(Character.isDigit(inputDob.charAt(i))){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    case 5 : 
		    	if (inputDob.charAt(i) == '/'){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    case 6 : 
		    	if(Character.isDigit(inputDob.charAt(i))){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    case 7 : 
		    	if(Character.isDigit(inputDob.charAt(i))){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    case 8 : 
		    	if(Character.isDigit(inputDob.charAt(i))){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    case 9 : 
		    	if(Character.isDigit(inputDob.charAt(i))){
		    		break;
		    	}
		    	else{
		    		System.out.println("Invalid date format"); // call the terminate class
		    		return false;
		    	}
		    default :
		    	System.out.println("Invalid date format"); // call the terminate class
	            return false;
		    }
		}
		return true;
	}
}
