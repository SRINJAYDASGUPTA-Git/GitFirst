import java.util.*;
class Sentence
{
void Sent(String sin)
{
int i,j,k=0,l,m=0;
String w="",temp;        
if(sin.endsWith(".")||sin.endsWith("!")||sin.endsWith("?"))
{
sin=sin.toUpperCase();
System.out.println(sin);
if(sin.endsWith("."))
sin=sin.substring(0,(sin.indexOf(".")));
else if(sin.endsWith("!"))
sin=sin.substring(0,(sin.indexOf("!")));
else
sin=sin.substring(0,(sin.indexOf("?")));
sin=sin+" ";
l=sin.length();
for(i=0;i<l;i++)
{
char ch=sin.charAt(i);
if(ch==' ')
k++;
}
String sar[]=new String[k];
for(i=0;i<l;i++)
{
char ch=sin.charAt(i);
if(ch!=' ')
w=w+ch;
else
{
sar[m]=w;
w="";
m++;
}
}
   for(i=0;i<(k-1);i++)
{
for(j=0;j<(k-1-i);j++)
{
if(sar[j].equals(" . ") || sar[j].equals(" ! ") || sar[j].equals(" ? "))	
continue;
if(sar[j].length()>sar[j+1].length())
{
temp=sar[j];
sar[j]=sar[j+1];
sar[j+1]=temp;
}
}
}
System.out.println("The arranged sentence=");
for(i=0;i<k;i++)
 System.out.print(sar[i]+" ");
}
else
System.out.println("Invali dinput");
}
publicstaticvoidmain(Stringars[])
{
String sin;
Scanner in=new Scanner(System.in);
System.out.println("Enterasentence");
sin=in.nextLine();
Sentence ob=new Sentence();
ob.Sent(sin);
}
}