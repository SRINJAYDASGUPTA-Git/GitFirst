import java.util.*;
class decToOct
{
String converter(int dec)
{
int r,n;
String oct="";
n=dec;
while(n!=0)
{
r=n%8;
oct=Integer.toString(r)+oct;
n=n/8;
}
return oct;
}
public static void main(String ars[])
{
decToOct ob=new decToOct();
Scanner in=new Scanner(System.in);
int dec;
String oct;
System.out.println("Enter the decimal");
dec=in.nextInt();
oct=ob.converter(dec);
System.out.println("Octal="+oct);
}
}