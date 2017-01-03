import java.util.*;
   class Cylinder
   {
     public static void main(String arg[])
     {
       int r,h;
       double vol;
       double pi = 3.14;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the Radius of cylinder:");
       r = s.nextInt();
       System.out.println("Enter the Height of cylinder");
       h = s.nextInt();
       vol =  pi*r*r*h;
       System.out.println("Volume of cylinder is"+vol);
      }
}
