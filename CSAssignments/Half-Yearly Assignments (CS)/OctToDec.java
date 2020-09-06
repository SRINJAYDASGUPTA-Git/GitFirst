import java.util.*;
class OctToDec
{
double converter(double oct)
{
double dec_out,dec1=0.0,dec2=0.0;String oct_s,oct_in,oct_frac;int pi,i,p;char ch;
oct_s=Double.toString(oct);
pi=oct_s.indexOf(".");
oct_in=oct_s.substring(0,pi);
oct_frac=oct_s.substring(pi+1);
p=oct_in.length();
int k=0;
for(i=(p-1);i>=0;i--)
{
 ch=oct_in.charAt(i);
if(Integer.parseInt(String.valueOf(ch))>7)
{
System.out.println("Invalid Octal No.");
System.exit(0);
}
int temp=Integer.parseInt(String.valueOf(ch));
dec1=dec1+(temp*Math.pow(8,k));
k++;	
}
p=oct_frac.length();
for(i=0;i<p;i++)
{
ch=oct_frac.charAt(i);
if(Integer.parseInt(String.valueOf(ch))>7)
{
System.out.println("Invalid Octal No.");
System.exit(0);
}
int temp=Integer.parseInt(String.valueOf(ch));
dec2=dec2+(temp*Math.pow(8,-(i+1)));
}
dec_out=dec1+dec2;
return dec_out;
}
public static void main(String ars[])
{
double oct;
Scanner in=new Scanner(System.in);
System.out.println("Enter a octal no. (fractions included)");
oct=in.nextDouble();
OctToDec ob=new OctToDec();
System.out.println("The decimal equivalent of "+oct+" is "+(ob.converter(oct)));
}
}