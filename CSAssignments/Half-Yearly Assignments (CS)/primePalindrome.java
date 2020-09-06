import java.util.*;
class primePalindrome
{
int start,end;
primePalindrome(int a,int b)
{
start=a;end=b;
}
int isPrime(int i)
{
int j,c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
c++;
}
if(c==2)
return 1;
else
return 0;
}
int isPalin(int i)
{
int n,j,r=0,d;
n=i;
while(n!=0)
{
d=n%10;
r=r*10+d;
n/=10;
}
if(r==i)
return 1;
else
return 0;
}
void generate()
{
int i;
System.out.println("The Prime palindrome no.s b/w "+start+" and "+end+" are ");
for(i=start;i<=end;i++)
{
if(isPrime(i)==1&&isPalin(i)==1)
System.out.println(i+" ");
}
}
public static void main(String ars[])
{
int a,b;
System.out.println("Enter the start and end points");
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
primePalindrome ob=new primePalindrome(a,b);
ob.generate();
}
}