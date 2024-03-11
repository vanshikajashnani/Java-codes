import java.lang.*;
import java.util.*;
class PosNeg
{
   public static void main(String[] args)
   {
       int a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a value");
       a=sc.nextInt();
       if(a>0)
         System.out.println(a+" is POSITIVE");
       else if(a==0)
         System.out.println(a+" is ZERO");
       else 
         System.out.println(a+" is NEGATIVE");
   }
}
