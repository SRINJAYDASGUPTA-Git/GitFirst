import java.util.*;
class digital_Root
{
int digitalRoot(int n)
{
int n1,s=0,d;
n1=n;
		while(true)
		{
		      while(n1!=0)
		       {
		               d=n1%10;
			       s=s+d;
			       n1/=10;
		        }
			if(s<10)
			break;
			else
			{
			   n1=s;
			   s=0;continue;
			}
	}
return s;
}
	public static void main(String ars[])
	{
		int n,dr;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a no.");
		n=in.nextInt();
		digital_Root ob=new digital_Root();
	 	dr=ob.digitalRoot(n);
	System.out.println("The Digital Root of "+n+" is "+dr);
	      
		
		
		
	}
}