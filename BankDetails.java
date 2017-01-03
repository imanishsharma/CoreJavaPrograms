abstract class Bank
 {
 abstract void interest();
 }

class SBI extends Bank
{
void interest()
     {
     System.out.println("SBI Provides 3.8% interest on house loans...");
     }
   }
    class ICICI extends Bank{
    void interest()
    {
    System.out.println("ICICI Provides 2.8% interest on house loans...");
    }
  }
 class BankDetails
  {
   public static void main(String arg[])
  {
  SBI s = new SBI();
  s.interest();
  ICICI i = new ICICI();
  i.interest();
 }
}