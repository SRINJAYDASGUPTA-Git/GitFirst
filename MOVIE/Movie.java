import java.util.*;
import java.io.*;
class Movie 
{
    public static void main(String ars[])throws IOException
    {
        int seats=5,seats_booked,p; String name, level, movie;
        Scanner in=new Scanner (System.in);
        String filename=("Movies.txt");
        FileWriter f=new FileWriter (filename,true);
        BufferedWriter b=new BufferedWriter(f);
        PrintWriter pout=new PrintWriter(b);
        Calendar c=  Calendar.getInstance();
        pout.println("Date : "+c.get(Calendar.DATE)+"/"+c.get((Calendar.MONTH))+"/"+c.get(Calendar.YEAR));  
        while(true)
        {
            System.out.print("Enter your name, please  \n"); 
            name=in.next();
            System.out.println("Enter the movie name : \n"+"Avengers:Endgame\n"+"Tenet\n"+"Sholay");
            movie=in.next();
            System.out.println("Enter the no. of seats");
            seats_booked=in.nextInt();
            seats=seats-seats_booked;
            System.out.println("Loading");
            try
            {
                for(int i=0;i<5;i++)
                {
                    System.out.print("...");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            if(seats<0)
            {
                System.out.println("Sorry all seats are booked");
                break;
            }

            else
            {
                System.out.println("ENJOY UR DAY !!\n"+"UR SEATS ARE BOOKED");
                pout.println("Name : "+name);
                pout.println("Move : "+movie);
                pout.println("Seats booked : "+seats_booked);
                pout.println("================================================");
            }
        }
        pout.close();
    }
}
