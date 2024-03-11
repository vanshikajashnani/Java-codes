import java.lang.*;
import java.util.*;
class QuadraticRoots
{
 public static void main(String[] args)
 {
    int a, b,c,d;
    double r1,r2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a b c values");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=(b*b)-(4*a*c);
if(d>=0)
{
 System.out.println("Real roots");
    r1=(-b+Math.sqrt(d))/(2*a);
    r2=(-b-Math.sqrt(d))/(2*a);
    System.out.println("Roots are "+r1+" and "+r2);
}
else
  System.out.println("Imaginary roots");
 }
}