import java.lang.*;
import java.util.*;
class OddEven
{
   public static void main(String[] args)
   {
       int a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a value");
       a=sc.nextInt();
       if(a%2==0)
         System.out.println(a+" is EVEN");
       else
         System.out.println(a+" is ODD");
   }
}
