import java.lang.*;
import java.util.*;
class Operations
{
   public static void main(String[] args)
   {
       int a,b,c,op;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a and b values");
       a=sc.nextInt();
       b=sc.nextInt();
       System.out.println("Enter operator");
       op=sc.next().charAt(0);
       switch(op)
       {
          case '+' :c=a+b;
                    System.out.println("Sum= "+c);break;
          case '-' :c=a-b;
                    System.out.println("Difference= "+c);break;
          case '%' :c=a%b;
                    System.out.println("Mod= "+c);break;
          case '*' :c=a*b;
                    System.out.println("Product= "+c);break;
          case '/' :c=a/b;
                    System.out.println("Quotient= "+c);break;
	  //default: System.out.println("Invalid choice");
       }
   }
}
