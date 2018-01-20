import javax.swing.JOptionPane;

public class ZodiacSign extends DateFormatCheck { 
	
	private static String zodiacSign = null;
	
	static void getZodiacSign() {
        
        if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
        	zodiacSign = "Aquarius";
        else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
        	zodiacSign = "Pisces";
        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
        	zodiacSign = "Aries";
        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
        	zodiacSign = "Taurus";
        else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
        	zodiacSign = "Gemini";
        else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
        	zodiacSign = "Cancer";
        else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
        	zodiacSign = "Leo";
        else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
        	zodiacSign = "Virgo";
        else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
        	zodiacSign = "Libra";
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
        	zodiacSign = "Scorpio";
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
        	zodiacSign = "Sagittarius";
        else if ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
        	zodiacSign = "Capricorn";
        else
            System.out.println("Not a valid date");
    
        infoBox();
	
	}
	
	private static void infoBox()
    {
        JOptionPane.showMessageDialog(null, "Your Zodiac Sign is : " + zodiacSign + "\n" + "Day Of the Week : " + DayOfWeek.weekDay, "Your Information : ", JOptionPane.INFORMATION_MESSAGE);
    }
}