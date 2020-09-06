import java.util.*;
class Fascinating
{
public static void main(String ars[])
{
int n,n2,j,n3,f=1;String N;char i;
Scanner in =new Scanner(System.in);
System.out.println("Enter a no. ");
n=in.nextInt();
if(n>100)
{
n2=n*2;
n3=n*3;
N=Integer.toString(n)+""+Integer.toString(n2)+Integer.toString(n3);
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
System.out.println("Fascinating");
else
System.out.println("Not a Fascinating no.");
}
else
System.out.println("Not a Fascinating no.");
}
}