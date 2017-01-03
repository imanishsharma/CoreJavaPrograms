import java.util.*;
import java.util.regex.*;
public class AlarmClock {
	private Pattern pattern;
	private Matcher matcher;
	private static final String TIME12HOURS_PATTERN = "(1[012]|[1-9]):[0-5][0-9](\\s)?(am|pm)";
	public AlarmClock()
	{
		pattern = Pattern.compile(TIME12HOURS_PATTERN);
	}
	public boolean validate(final String time)
	{
		matcher = pattern.matcher(time);
		return matcher.matches();
		
	}
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		String time;
		boolean status;
		System.out.println("Enter the alarm time");
		time = s.nextLine();
		AlarmClock ac = new AlarmClock();
		status=ac.validate(time);
		if (status == true)
		{
			System.out.println("Correct time...");
			
		} else {
			System.out.println("Incorrect time...");
		}
	}

}
