import java.util.*;
import java.util.regex.*;
public class LoginForm {
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		String email, password;
		Pattern MyPattern, MyPattern1;
		Matcher MyMatcher, MyMatcher1;
		Boolean MyBoolean, MyBoolean1;
		int flag =0,flag1=0;
		MyPattern = Pattern.compile("[\\w+\\.+]*[\\w+\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
		MyPattern1 = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$");
		do{
			flag =0;
			System.out.println("Enter the email id");
			email = s.nextLine();
			MyMatcher = MyPattern.matcher(email);
			MyBoolean = MyMatcher.matches();
			if(MyBoolean == true){
				do{
					flag =0;
					System.out.println("Enter the password");
					password = s.nextLine();
					MyMatcher1 = MyPattern1.matcher(password);
					MyBoolean1 = MyMatcher1.matches();
					if(MyBoolean1 == true){
						System.out.println("you entered valid email id and password");
					}else{
						System.out.println("Passwprd is incorrect");
						flag =1;
					}
					}while(flag==1);
			}else{
				System.out.println("Email is incorrect");
				flag =1;
			}
			}while(flag==1);
		}
	}
