import java.util.regex.*;
import java.util.Scanner;
public class Exercise1
{
   public static void main(String arg[])
   {
     String w;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the three letter word");
     w = s.next();
     Pattern p = Pattern.compile("[abc]at");
     Matcher m = p.matcher(w);
    if(m.find())
     {
         System.out.println("Expression Matched");
     }
     else
     {
        System.out.println("Expression not Matched");
     }
}}