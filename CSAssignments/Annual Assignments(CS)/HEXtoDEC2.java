import java.util.*;
class HEXtoDEC2
{
int converter(String hexin)
{
String hex="0123456789ABCDEF";
int dec=0,i,p,n,k;
hexin=hexin.toUpperCase();
p=hexin.length();
k=p-1;
for(i=0;i<p;i++)
{
char ch=hexin.charAt(i);
if((int)ch>(int)('F'))
{
System.out.println("Invalid Hexadecimal no.");
System.exit(0);
}
n=hex.indexOf(ch);
dec=dec+(int)(n*(Math.pow(16,k)));
k--;
if(k<0)
break;
}
return dec;
}
public static void main(String ars[])
{
HEXtoDEC2 ob=new HEXtoDEC2();
String hexin;
int dec;
System.out.println("Enter the hex");
Scanner in=new Scanner(System.in);
hexin=in.next();
hexin=hexin.toUpperCase();
dec=ob.converter(hexin);
System.out.println ("The Decimal value is "+dec);
}
}