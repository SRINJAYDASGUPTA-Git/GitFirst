import java.util.*;
class decToBin
{
String converter(double dec)
{
String bin=""; int dec_in,d;double dec_frac;
dec_in=(int)dec;
dec_frac=dec-dec_in;
while(dec_in!=0)
{
d=dec_in%2;
bin=Integer.toString(d)+bin;
dec_in/=2;
}
bin=bin+".";
for(int i=0;i<5;i++)
{
dec_frac*=2;
int fract_bit = (int) dec_frac; 
  
if (fract_bit == 1) 
{
dec_frac -= fract_bit; 
bin+= (char)(1 + '0'); 
} 
else
{ 
bin += (char)(0 + '0'); 
} 
}
return bin;
}
public static void main(String ars[])
{
Scanner in=new Scanner (System.in);
double dec;String bin;
System.out.println("Enter the decimal no.");
dec=in.nextDouble();
decToBin ob=new decToBin();
bin=ob.converter(dec);
System.out.println("The binary equivalent of "+dec+" is "+bin);
}
}
