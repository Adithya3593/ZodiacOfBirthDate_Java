import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfWeek extends DateFormatCheck {
	
	static String weekDay = null;

	static void getDayOfWeek() throws ParseException {
         
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 Date userDate = simpleDateFormat.parse((String.format("%d/%d/%d",day,month,year)));
         //System.out.println(userDate);
         Calendar calendar = Calendar.getInstance();
         calendar.setTime(userDate);
         int dayInteger =  calendar.get(Calendar.DAY_OF_WEEK);
	        switch(dayInteger){
		    case 1 : 
		    	weekDay = "SUNDAY";
		    	break;
		    case 2 : 
		    	weekDay = "MONDAY";
		    	break;
		    case 3 : 
		    	weekDay = "TUESDAY";
		    	break;
		    case 4 : 
		    	weekDay = "WEDNESDAY";
		    	break;
		    case 5 : 
		    	weekDay = "THRUSDAY";
		    	break;
		    case 6 : 
		    	weekDay = "FRIDAY";
		    	break;
		    case 7 : 
		    	weekDay = "SATURDAY";
		    	break;
	        }
	}
}
