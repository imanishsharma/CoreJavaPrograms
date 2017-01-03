import java.util.*;
class Calculator
{
  public static void main(String arg[])
  {
    float num1;
    float num2; 
    float result; 
    int option;
    Scanner n = new Scanner(System.in);
    System.out.println("Enter the first number:");
    num1 = n.nextInt();
    System.out.println("Enter the second number:");
    num2 = n.nextInt();
    System.out.println("Menu:");
    System.out.println("1. addition");
    System.out.println("2. substraction");
    System.out.println("3. multiplication");
    System.out.println("4. division");
    System.out.println("enter the operation that u want to perform:");
    option = n.nextInt();
    switch(option)
    {
      case 1 :
            result = num1+num2;
            System.out.println("Result is:"+result);
            break;
      case 2 :
            result = num1-num2;
            System.out.println("Result is:"+result);
            break;
      case 3 :
            result = num1*num2;
            System.out.println("Result is:"+result);
            break;
      case 4 :
            result = num1/num2;
            System.out.println("Result is:"+result);
            break;
      default :
            System.out.println("Invalid Option");
            break;

     }
   }
}
  
