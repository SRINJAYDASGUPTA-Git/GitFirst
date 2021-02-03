import java.util.*;
class decToHex
{
String converter(double dec)
{
        int r,n;
        String hex="";
        n=(int)dec;
        char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n!=0)
        {
            r=n%16;
            hex=dig[r]+hex;
            n=n/16;
        }
        hex=hex+".";
        double f=dec-((int)dec);
        
        for(int i=0;i<5;i++)
        {
            f*=16;
            int fract_bit = (int) f; 
            f=f-fract_bit;
            hex += dig[fract_bit];
        }

        return hex;
    }
	
public static void main(String ars[])
{
decToHex ob=new decToHex();
Scanner in=new Scanner(System.in);
int dec;
String hex;
System.out.println("Enter the decimal");
dec=in.nextInt();
hex=ob.converter(dec);
System.out.println("Hexadecimal="+hex);
}
}