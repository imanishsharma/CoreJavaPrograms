import java.util.*;
class Characters
{
  public static void main(String arg[])
  {
   char ch;
   Scanner s = new Scanner(System.in); 
   System.out.println("Enter a Alphabet");
   ch = s.next().charAt(0);
   switch(ch)
   {
     case 'a':
     case 'A':
     System.out.println("It is a vowel");
     break;
     
     case 'e':
     case 'E':
     System.out.println("It is a vowel");
     break;
     case 'i':
     case 'I':
        System.out.println("It is a vowel");
        break;
     case 'o':
     case 'O':
        System.out.println("It is a vowel");
        break;
     case 'u':
     case 'U':
        System.out.println("It is a vowel");
        break;
     default:
     System.out.println("It is a consonant");
     }
}
}