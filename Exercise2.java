class Exercise2
{
   public int add(int num1,int num2)
   {
     return num1 + num2;
   }
   public double add(double num1, double num2)
   {
     return num1 + num2;
   }
   public int add(int num1,int num2, int num3)
   {
     return num1 + num2 + num3;
   }
  public static void main(String arg[])
  {
    int c =20, d= 100, e=120;
    double i= 5.5,j=3.5;
    Exercise2 obj = new Exercise2();
    System.out.println("Add of two integer number:"+ obj.add(c,d));
   
    System.out.println("Add of two fractional number:"+ obj.add(i,j));
    System.out.println("Add of three integer numbers:"+ obj.add(c,d,e));
    
  }
}