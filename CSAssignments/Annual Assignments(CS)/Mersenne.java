import java.util.*;
class Mersenne
{
   long num;
    Mersenne(long n)
    {
        num=n;
    }
    int isMersenne()
    {
        long i,n1,power;n1=num+1;int M=0;
        for(i=0;;i++)
        {
            power=(int)(Math.pow(2,i));
            if(power==n1)
            {
                M=1;
                break;
            }
        }
        return M;
    }
    int isDoubleMersenne()
    {
        long i,n1,power,p;n1=num+1;int DM=0,M=0;
        for(i=0;;i++)
        {
            power=(int)(Math.pow(2,i));
            if(power==n1)
            {
                p=i;
                M=1;break;
            }
        }
        if(M==1)
        {
            long n2,p2;
            n2=p+1;
            for(i=0;;i++)
            {
                p2=(int)(Math.pow(2,i));
                if(p2==n2)
                {
                    DM=1;
                    break;
                }
            }
        }
        return DM;
    }
void genMersenne()
{
long Mer=(int)((Math.pow(2,num))-1);
System.out.println("A  Mersenne No. = "+Mer);
}
void genDoubleMersenne()
{
long DMer=(int)((Math.pow(2,((Math.pow(2,num))-1)))-1);
System.out.println("A Double Mersenne No. = "+DMer);
}
    public static void main(String ars[])
    {
        int N;
        System.out.println("Enter num");
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        Mersenne ob=new Mersenne(N);
        int M=ob.isMersenne();
        if (M==1)
            System.out.println(N+" is a Mersenne");
        else
            System.out.println(N+" is not a Mersenne");
        int DM=ob.isDoubleMersenne();
        if (DM==1)
            System.out.println(N+" is a Double Mersenne");
        else
            System.out.println(N+" is not a Double Mersenne");
        ob.genMersenne();ob.genDoubleMersenne();
    }
}