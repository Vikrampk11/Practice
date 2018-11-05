package JavaBasics.Testng;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class dateDifference {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = sdf.parse("2018-09-01");// Set start date
				Date endDate   =sdf.parse("2018-09-31"); // Set end date

				long duration  = endDate.getTime() - startDate.getTime();

				long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
				long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
				long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
				long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);
				
				System.out.println(diffInSeconds+ "/n" +diffInMinutes+ "/n" +diffInHours+"/n"+diffInDays);

	}

}
