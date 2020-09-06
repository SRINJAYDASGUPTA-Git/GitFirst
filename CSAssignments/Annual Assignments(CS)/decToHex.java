import java.util.*;
class decToHex
{
String converter(int dec)
{
int r,n;
String hex="";
n=dec;
char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
while(n!=0)
{
r=n%16;
hex=dig[r]+hex;
n=n/16;
}
return hex;
}
public static void main(String ars[])
{
Scanner in=new Scanner(System.in);
int dec;
String hex;
System.out.println("Enter the decimal");
dec=in.nextInt();
hex=ob.converter(dec);
System.out.println("Hexadecimal="+oct);
}
}