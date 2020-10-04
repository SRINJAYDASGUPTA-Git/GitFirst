import java.util.*;
class Fascinating
{
void check(int n)
{
int n2,j,n3,f=1;String N;char i;
if(n>=100)
{
n2=n*2;
n3=n*3;
N=Integer.toString(n)+""+Integer.toString(n2)+""+Integer.toString(n3);
for(i='1';i<='9';i++)
{
int c=0;
for(j=0;j<N.length();j++)
{
char ch=N.charAt(j);
if(ch==i)
c++;
}
if(c>1||c==0)
{
f=0;break;
}
}
if(f==1)
System.out.println(n+" is a Fascinating Number");
else
System.out.println(n+" is not a Fascinating Number");
}
else
System.out.println ("Invalid Input");
}
public static void main(String ars[])
{
int n;
Scanner in =new Scanner(System.in);
System.out.println("Enter a no. of 3 digits ");
n=in.nextInt();
Fascinating ob=new Fascinating();
ob.check(n);
}
}
