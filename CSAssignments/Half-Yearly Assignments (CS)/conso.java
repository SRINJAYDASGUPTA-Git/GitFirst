import java.util.*;
class conso
{
    void Display(String str)
    {
        str=str.toLowerCase();
        int i,p;
        char c;
        p=str.length();
        for(i=0;i<p;i++)
        {
            c=str.charAt(i);
            if(c!='a'||c!='e'||c!='i'||c!='o'||c!='u')
	{
           		 System.out.println(c);
	  }          
        }
    }
    public static void main(String ars[])
    {
        String str;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String");
        str=in.next();
        conso ob=new conso();
        ob.Display(str);
    }
}