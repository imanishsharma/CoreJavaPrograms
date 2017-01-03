import  java.util.*;
public class Distance
   {
     public static void main(String arg[])
     { 
      float distance,u,a;
      int t;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the value of u");
      u = s.nextInt();
      System.out.println("Enter the value of a");
      a = s.nextInt();
      System.out.println("Enter the value of time");
      t = s.nextInt();
      distance = u*t + (a*t*t)/2;
      System.out.println("Total Distance travelled by vehicle is:"+distance); 
    }
   }
  