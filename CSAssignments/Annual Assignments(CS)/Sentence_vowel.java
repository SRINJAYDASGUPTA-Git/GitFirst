import java.util.*;
class Sentence_vowel
{
void Sent_Vow(String s)
{
String sa="",w="";int i,l,k=0,m=0;

if(s.equals(".")||s.equals("?"))
{
System.out.println("the Program terminates");
System.exit(0);

}
else
{
if(s.endsWith(".")==true|| s.endsWith("?")==true||s.endsWith("!")==true)
{
s=s+" ";s=s.toUpperCase();s=s.substring(0,(s.indexOf(".")));l=s.length();
for(i=0;i<l;i++)
{
char ch=s.charAt(i);
if(ch!=' ')
w=w+ch;
else
{
if((w.startsWith("A")==true ||w.startsWith("E")==true ||w.startsWith("I")==true ||w.startsWith("O")==true ||w.startsWith("U")==true)&&(w.endsWith("A")==true ||w.endsWith("E")==true ||w.endsWith("I")==true ||w.endsWith("O")==true ||w.endsWith("U")==true))
{
sa=w+" "+sa;
w="";
}
else
{
sa=sa+w+" ";
w="";
}
}
}
}
else
System.out.println("Invalid input");
}
System.out.println(sa);
}
public static void main(String ars[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a Sentence or , '.'or '?' to terminate");
String s;
s=in.nextLine();
Sentence_vowel ob=new Sentence_vowel();
ob.Sent_Vow(s);
}
}