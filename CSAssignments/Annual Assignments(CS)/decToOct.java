import java.util.*;
class decToOct
{
String converter(double dec)
{
        int r,n;
        String oct="";
        n=(int)dec;

        char dig[]={'0','1','2','3','4','5','6','7'};
        while(n!=0)
        {
            r=n%8;
            oct=dig[r]+oct;
            n=n/8;
        }
        oct=oct+".";
        double f=dec-((int)dec);
        for(int i=0;i<5;i++)
        {
            f*=8;
            int fract_bit = (int) f; 
            f=f-fract_bit;
            oct += dig[fract_bit];
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