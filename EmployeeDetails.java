import java.util.*;
class EmployeeDetails
    {  
      public void showMenu()
      { 
      int option;
      Scanner s = new Scanner(System.in);
      System.out.println("-------MENU-------");
      System.out.println("1. Enter Data");
      System.out.println("2. Display Data");
      System.out.println("3. Exit");
      System.out.println("Choose the option");
      option = s.nextInt();
      switch(option)
      {
       case 1:
          EmployeeDetails obj = new EmployeeDetails();
          obj.enterData();
          break;
      case 2:
          EmployeeDetails obj1 = new EmployeeDetails();
          obj1.displayData();
          break;
      case 3:
          break;
      default:
          System.out.println("Invalid option");
          break;
     }
}
      public void enterData()
      {
        System.out.println("enterData method is invoked...");
       }
      public void displayData()
      {
       System.out.println("displayData method is invoked...");
      }
public static void main(String arg[])
{
   EmployeeDetails obj2 = new EmployeeDetails();
   obj2.showMenu();
}
}