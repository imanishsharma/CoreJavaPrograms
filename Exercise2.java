class Details
{
  String firstName, lastName;
  int age;
  public Details(String firstName, String lastName, int age)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
}
  class StudentDetails extends Details
  {
    String courseEnrolled;
    String studentID;
    public StudentDetails(String firstName, String lastName, int age, String courseEnrolled,String studentID)
    {
        super(firstName,lastName,age);
        this.courseEnrolled = courseEnrolled;
        this.studentID = studentID;
    }
    void showStudentDetails()
    {
     System.out.println("Student Details");
     System.out.println("First name :  "+firstName);
     System.out.println("Last name:  "+lastName);
     System.out.println("Age :  "+age);
     System.out.println("Course Enrolled :  "+courseEnrolled);
     System.out.println("Student ID :  "+studentID);
    }
   }
  class EmployeeDetails extends Details
  {
    String departmentName;
    String designation;
    String employeeID;
    public EmployeeDetails(String firstName, String lastName, int age, String departmentName,String designation,String employeeID)
    {
      super(firstName,lastName,age);
      this.departmentName = departmentName;
      this.designation = designation;
     }
      void showEmployeeDetails()
     {
     System.out.println("Employee Details");
     System.out.println("First name :  "+firstName);
     System.out.println("Last name:  "+lastName);
     System.out.println("Age :  "+age);
     System.out.println("Department Name :  "+departmentName);
     System.out.println("Designation:  "+designation);
    }
   }
  class Exercise2
  {
    public static void main(String arg[])
    {
      StudentDetails obj = new StudentDetails("Dheeraj","Sharma",21,"BSC","S151160800159");
      obj.showStudentDetails();
      EmployeeDetails obj1 = new EmployeeDetails("Diljeet","Singh",21,"IT","Software Developer","S151160800187");
      obj1.showEmployeeDetails();
    }
}
    
    