
class EmployeeDetails
{
   String empID,name,designation,department;
   public EmployeeDetails()
   {
     empID = "S151160800159";
     name = "Dheeraj Sharma";
     designation = "Software Developer";
     department = "IT";
   }
   public String toString()
   {
     return "Employee ID: " + empID + 
     " Employee Name: " + name + 
     " Designation: " + designation + 
     " Department :" + department;
   }
   public static void main(String arg[])
   {
    EmployeeDetails obj = new EmployeeDetails();
    System.out.println(obj);
   }
 }     
