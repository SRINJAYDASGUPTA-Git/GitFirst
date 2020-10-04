import java.util.*;
class Mersenne
{
long num;
Mersenne(long n)
{
num=n;
}
int isMersenne()
{
long n=0;int i,f=0;
for( i=1;;i++)
{
n=(long)(Math.pow(2,i)-1);
if(n==num){
f=1;
break;
}
}
return f;
}
int isDoubleMersenne()
{
long n=0, pwr=0;int f=0;
for(int i=1;;i++)
{
pwr=(long)Math.pow(2,i)-1;
n=(long)(Math.pow(2,pwr)-1);
if(n==num)
{
f=1;
break;
}
}
return f;
}
public void genMersenne(){
 num=0;
System.out.println("Generated Mersenne numbers are :");
for(int i=1;i<=10;i++)
{
num=(long)(Math.pow(2,i)-1);
System.out.print(num+" ");
}
System.out.println();
}
public void genDoubleMersenne()
{
 num=0;long pwr=0;
System.out.println("Generated double Mersenne Numbers are:");
for(int i=1;i<=10;i++)
{
pwr=(long)Math.pow(2,i)-1;
num=(long)(Math.pow(2,pwr)-1);
System.out.print(num+"   ");
}
System.out.println();
}
public static void main(String ars[])
{
int N;
System.out.println("Enter num");
Scanner in=new Scanner(System.in);
N=in.nextInt();
Mersenne ob=new Mersenne(N);
if (ob.isMersenne()==1)
System.out.println(N+" is a Mersenne");
else
System.out.println(N+" is not a Mersenne");
if (ob.isDoubleMersenne()==1)
System.out.println(N+" is a Double Mersenne");
else
System.out.println(N+" is not a Double Mersenne");
ob.genMersenne();ob.genDoubleMersenne();
}
}