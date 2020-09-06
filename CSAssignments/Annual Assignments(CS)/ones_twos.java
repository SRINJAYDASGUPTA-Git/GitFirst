import java.util.*;
class ones_twos
{
String ones(String bin)
{
String one="";int p,i;char c;
p=bin.length();
        for(i=0;i<p;i++)
        {
            c=bin.charAt(i);
            if(c=='1')
                one=one+"0";
            else
                one=one+"1";
        }
return one;
}
String twos(String bin)
{
String two="";int p,i,last;char c;
 last=bin.lastIndexOf("1");
p=bin.length();
        two=two+bin.substring(last,p);
        p=(bin.substring(0,last)).length();
        for(i=p-1;i>=0;i--)
        {
            c=(bin.substring(0,last)).charAt(i);
            if(c=='1')
                two="0"+two;
            else
                two="1"+two;
        }
return two;
}
    public static void main(String ars[])
    {
        String bin,one, two;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Binary no.");
        bin=in.next();
        ones_twos ob=new ones_twos();
        one=ob.ones(bin);
        two=ob.twos(bin);	
        System.out.println("One's="+one);
        System.out.println("Two's="+two);
    }
}