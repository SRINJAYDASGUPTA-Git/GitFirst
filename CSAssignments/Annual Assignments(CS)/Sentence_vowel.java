import java.util.*;
class Sentence_vowel
{
void Sent_Vow(String s)
{
String sa="",w="";int i,l,k=0,m=0;
if(s.endsWith(".")|| s.endsWith("?")||s.endsWith("!"))
{
s=s+" ";
s=s.toUpperCase();
s=s.substring(0,(s.indexOf(".")));
l=s.length();
for(i=0;i<l;i++)
{
char ch=s.charAt(i);
if(ch!=' ')
w=w+ch;
else
{
if((w.startsWith("A")||w.startsWith("E") ||w.startsWith("I") ||w.startsWith("O") ||w.startsWith("U"))&&(w.endsWith("A") ||w.endsWith("E") ||w.endsWith("I") ||w.endsWith("O") ||w.endsWith("U")))
{
k++;
sa=sa+" "+w;
w="";
}
else
{
sa=sa+" "+w+" ";
w="";
}
}
}
System.out.println("The no. of words which start and end with a vowel are "+ k);
}
else
System.out.println("Invalid input");
System.out.println(sa);
}
public static void main(String ars[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a Sentence or terminating with '.' or '!' ");
String s;
s=in.nextLine();
Sentence_vowel ob=new Sentence_vowel();
ob.Sent_Vow(s);
}
}