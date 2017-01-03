import java.util.*;
class Temprature
{
   public static void main(String arg[])
   {
     double f;
     double c;
     Scanner s= new Scanner(System.in); 
     System.out.println("Enter the temprature to convert from celsius to fahrenheit:");
     c = s.nextInt();
     System.out.println("The entered celsius temprature is:"+ c +" celsius ");
     f = c*9/5+32;
     System.out.println("The converted temprature from celsius to fahrenheit is"+f+" fahrenheit ");
    }
 }      