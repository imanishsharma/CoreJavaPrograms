import java.util.*;
class population
{
   public static void main(String arg[])
   {
     int population= 80000;
     int men=52;
     int literate = 35;
     int illiterate;
     Scanner s = new Scanner(System.in);
     men = population*men/100;
     System.out.println("Number of Men in population:"+men);
     literate = men*literate/100;
     System.out.println("Number of literate men:"+literate);
     illiterate = men-literate;
     System.out.println("Number of illiterate men in population:"+illiterate);
   }
} 
