import java.util.*;
class binarytodecimal
{
double converter(double bin)
{
double dec_out,dec1=0.0,dec2=0.0;String bin_s,bin_in,bin_frac;int pi,i,p;char ch;
bin_s=Double.toString(bin);
pi=bin_s.indexOf(".");
bin_in=bin_s.substring(0,pi);
bin_frac=bin_s.substring(pi+1);
p=bin_in.length();
int k=0;
for(i=(p-1);i>=0;i--)
{
 ch=bin_in.charAt(i);
if(Integer.parseInt(String.valueOf(ch))>1)
{
System.out.println("Invalid Binary No.");
System.exit(0);
}
int temp=Integer.parseInt(String.valueOf(ch));
dec1=dec1+(temp*Math.pow(2,k));
k++;	
}
p=bin_frac.length();
for(i=0;i<p;i++)
{
ch=bin_frac.charAt(i);
if(Integer.parseInt(String.valueOf(ch))>1)
{
System.out.println("Invalid Binary No.");
System.exit(0);
}
int temp=Integer.parseInt(String.valueOf(ch));
dec2=dec2+(temp*Math.pow(2,-(i+1)));
}
dec_out=dec1+dec2;
return dec_out;
}
public static void main(String ars[])
{
double bin;
Scanner in=new Scanner(System.in);
System.out.println("Enter a binary no. (fractions included)");
bin=in.nextDouble();
binarytodecimal ob=new binarytodecimal();
System.out.println("The decimal equivalent of "+bin+" is "+(ob.converter(bin)));
}
}