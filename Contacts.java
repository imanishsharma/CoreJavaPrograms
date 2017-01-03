import java.util.*;
import java.util.regex.*;
public class Contacts
{
public static void main(String args[])
{
	Scanner input =  new Scanner(System.in);
	Boolean MyBoolean, MyBoolean1;
	String name, contactNumber;
	do{
		System.out.println("Enter the first name: ");
		name = input.nextLine();
		Pattern Mypattern =  Pattern.compile("^[a-zA-Z]+$");
		Matcher Mymatcher = Mypattern.matcher(name);
		MyBoolean = Mymatcher.matches();
		if(MyBoolean == false){
			System.out.println("Please enter correct name");
			MyBoolean = true;
		}else{
			MyBoolean = false;
		}
		}while (MyBoolean == true);
		do{
			System.out.println("Enter the Contact number");
			contactNumber = input.nextLine();
			Pattern MyPattern1 = Pattern.compile("(\\d-)?(\\d{2}-)?\\d{4}-\\d{4}");
			Matcher Mymatcher1 = MyPattern1.matcher(contactNumber);
			MyBoolean1 = Mymatcher1.matches();
			if(MyBoolean1 == false){
				System.out.println("Please enter the correct contact number");
				MyBoolean1 = true;
			}else{
				MyBoolean1 = false;
			}
		} while(MyBoolean1 == true);
		System.out.println("Name and Contact number are correct");
		System.out.println("Name"+name);
		System.out.println("Contact"+contactNumber);
	}
}
	
