import java.lang.*;
import java.util.*;
class Lcm
{
int Lcm(int n1,int n2)
{
int i,lc,a=0;
for(i=1;i<=n1 && i<=n2;i++)
{
if(n1%i==0 && n2%i==0)
   a=i;
}
lc=(n1*n2)/a;
return lc;
}
public static void main(String args[])
{
int n1,n2,x;
Lcm m=new Lcm();
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 numbers");
n1=sc.nextInt();
n2=sc.nextInt();
x=m.Lcm(n1,n2);
System.out.println("LCM of "+n1+"and"+n2+"="+x);
}
}