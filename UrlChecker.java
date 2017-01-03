import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UrlChecker {
	public static void main(String args[])
	{
		Pattern UrlPattern = Pattern .compile("^((https?|ftp)://|(www|ftp)\\.)[a-z0-9-]+(\\.[a-z0-9-]+[a-z]+)+([/?].*)7$");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the URL to be checked:");
		String name = input.nextLine();
		Matcher UrlMatcher = UrlPattern.matcher(name);
		Boolean MyBoolean = UrlMatcher.matches();
		if(MyBoolean == true)
		{
			System.out.println("Url is Coorect");
		}else{
		System.out.println("Url is incorrect");
		}
		}
	}

