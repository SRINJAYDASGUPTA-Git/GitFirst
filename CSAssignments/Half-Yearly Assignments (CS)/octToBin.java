import java.util.*;
class octToBin
{
String oct_converter(double oct)
{
int i,p;String bin="",oct_i;
oct_i=Double.toString(oct);
            p=oct_i.length();

            for(i=0;i<p;i++)
            {
                  char ch=oct_i.charAt(i);
                switch(ch)
	{
	case '0':
	bin=bin+"000";
	break;
	case '1':
	bin=bin+"001";
	break;
	case '2':
	bin=bin+"010";
	break;
	case '3':
	bin=bin+"011";
	break;
	case '4':
	bin=bin+"100";
	break;
	case '5':
	bin=bin+"101";
	break;
	case '6':
	bin=bin+"110";
	break;
	case '7':
	bin=bin+"111";
	break;
	case '.':
	bin=bin+".";
	break;
	default:
	System.out.println("Invalid Octal no.");
	System.exit(0);
	}
            }
return bin;
}
      public static void main(String ars[])
      {
            octToBin ob=new octToBin();
            double oct;String bin;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the octal no.");
            oct=in.nextDouble();
            bin=ob.oct_converter(oct);
            System.out.println("The Binary equivalent of ("+oct+")8 is ("+bin+")2");
       }
}
