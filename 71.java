import java.util.Scanner;
 
class ChkPalindrome
{
   public static void main(String args[])
   {
      String rev = "";
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
       int length = str.length();
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
       if (str.equals(rev))
         System.out.println("yes");
      else
         System.out.println("no");
   }
}
