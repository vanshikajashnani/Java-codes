import java.lang.*;
import java.util.*;
class LargestOfThree
{
 public static void main(String[] args)
 {
    int a, b,c;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter three numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b && a>c)
      System.out.println("A is largest");
    else if(b>a && b>c)
      System.out.println("B is largest");
    else 
      System.out.println("C is largest");
  }
}