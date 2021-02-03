import java.util.*;
import java.io.*;
class Movie  
{
    public static void main(String ars[])throws IOException
    {
        int seats_t =5;
        int seats_eg=5;
        int seats_s=5;
        int price=50, pricep;
        Movie ob=new Movie();
        int seats_booked,p; String name, level, movie;
        Scanner in=new Scanner (System.in);
        String filename=("MoviesTicket.txt");
        FileWriter f=new FileWriter (filename,true);
        BufferedWriter b=new BufferedWriter(f);
        PrintWriter pout=new PrintWriter(b);
        Calendar c=  Calendar.getInstance();
        pout.println("Date : "+c.get(Calendar.DATE)+"/"+c.get((Calendar.MONTH+1))+"/"+c.get(Calendar.YEAR));  
        while(true)
        {
            if(seats_eg<0 && seats_t<0 && seats_s<0)
            {
                System.out.println("ALL SEATS ARE BOOKED FOR ALL THE MOVIES");
                break;
            }
            System.out.print("Enter your name, please  \n"); 
            name=in.next();
            System.out.println("Enter the movie name : \n"+"EG for Avengers:Endgame\n"+"T for Tenet\n"+"S for Sholay");
            movie=in.next();
            System.out.print("Loading");
            try
            {
                for(int i=0;i<3;i++)
                {
                    System.out.print("...");
                    Thread.sleep(750);
                }
                System.out.println();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

            switch(movie)
            {
                case "T":
                System.out.println("Enter the no. of seats");
                seats_booked=in.nextInt();pricep=price*seats_booked;
                if(seats_booked>seats_t && seats_t>0)
                {
                    System.out.println("That many seats are not avalable");
                    break;
                }
                seats_t-=seats_booked;
                if(seats_t<0 )
                {
                    System.out.println("Sorry all seats are booked for TENET");
                    seats_t-=seats_booked;
                    break;
                }
                System.out.println("Your tickets are booked\n"+"Enjoy ur day");
                pout.println("Name : "+name);
                pout.println("Move : Tenet");
                pout.println("Seats booked : "+seats_booked);
                pout.println("Price : "+"\u20B9"+pricep);
                System.out.println("Seats left : "+seats_t);
                pout.println("================================================");
                break;
                case "t":
                System.out.println("Enter the no. of seats");
                seats_booked=in.nextInt();pricep=price*seats_booked;
                if(seats_booked>seats_t && seats_t>0)
                {
                    System.out.println("That many seats are not avalable");
                    break;
                }
                seats_t-=seats_booked;
                if(seats_t<0 )
                {
                    System.out.println("Sorry all seats are booked for TENET");
                    seats_t-=seats_booked;
                    break;
                }
                System.out.println("Your tickets are booked\n"+"Enjoy ur day");
                pout.println("Name : "+name);
                pout.println("Move : Tenet");
                pout.println("Seats booked : "+seats_booked);
                pout.println("Price : "+"\u20B9"+pricep);
                System.out.println("Seats left : "+seats_t);
                pout.println("================================================");
                break;
                case "EG":
                System.out.println("Enter the no. of seats");
                seats_booked=in.nextInt();pricep=price*seats_booked;
                if(seats_booked>seats_eg && seats_eg>0)
                {
                    System.out.println("That many seats are not avalable");
                    break;
                }
                seats_eg-=seats_booked;
                if(seats_eg<0 )
                {
                    System.out.println("Sorry all seats are booked for Avengers:Endgame");
                    seats_eg-=seats_booked;
                    break;
                }
                System.out.println("Your tickets are booked\n"+"Enjoy ur day");
                pout.println("Name : "+name);
                pout.println("Move : Avengers:Endgame");
                pout.println("Seats booked : "+seats_booked);
                pout.println("Price : "+"\u20B9"+pricep);
                System.out.println("Seats left : "+seats_eg);
                pout.println("================================================");
                break;
                case "eg":
                System.out.println("Enter the no. of seats");
                seats_booked=in.nextInt();pricep=price*seats_booked;
                if(seats_booked>seats_eg && seats_eg>0)
                {
                    System.out.println("That many seats are not avalable");
                    break;
                }
                seats_eg-=seats_booked;
                if(seats_eg<0 )
                {
                    System.out.println("Sorry all seats are booked for Avengers:Endgame");
                    seats_eg-=seats_booked;
                    break;
                }
                System.out.println("Your tickets are booked\n"+"Enjoy ur day");
                pout.println("Name : "+name);
                pout.println("Move : Avengers:Endgame");
                pout.println("Seats booked : "+seats_booked);
                pout.println("Price : "+"\u20B9"+pricep);
                System.out.println("Seats left : "+seats_eg);
                pout.println("================================================");
                break;
                case "Eg":
                System.out.println("Enter the no. of seats");
                seats_booked=in.nextInt();pricep=price*seats_booked;
                if(seats_booked>seats_eg && seats_eg>0)
                {
                    System.out.println("That many seats are not avalable");
                    break;
                }
                seats_eg-=seats_booked;
                if(seats_eg<0 )
                {
                    System.out.println("Sorry all seats are booked for Avengers:Endgame");
                    seats_eg-=seats_booked;
                    break;
                }
                System.out.println("Your tickets are booked\n"+"Enjoy ur day");
                pout.println("Name : "+name);
                pout.println("Move : Avengers:Endgame");
                pout.println("Seats booked : "+seats_booked);
                pout.println("Price : "+"\u20B9"+pricep);
                System.out.println("Seats left : "+seats_eg);
                pout.println("================================================");
                break;
                case "S":
                System.out.println("Enter the no. of seats");
                seats_booked=in.nextInt();pricep=price*seats_booked;
                if(seats_booked>seats_s && seats_s>0)
                {
                    System.out.println("That many seats are not avalable");
                    break;
                }
                seats_s-=seats_booked;
                if(seats_s<0 )
                {
                    System.out.println("Sorry all seats are booked for Sholay");
                    seats_s-=seats_booked;
                    break;
                }
                System.out.println("Your tickets are booked\n"+"Enjoy ur day");
                pout.println("Name : "+name);
                pout.println("Move : Sholay");
                pout.println("Seats booked : "+seats_booked);
                pout.println("Price : "+"\u20B9"+pricep);
                System.out.println("Seats left : "+seats_s);
                pout.println("================================================");
                break;
                case "s":
                System.out.println("Enter the no. of seats");
                seats_booked=in.nextInt();pricep=price*seats_booked;
                if(seats_booked>seats_s && seats_s>0)
                {
                    System.out.println("That many seats are not avalable");
                    break;
                }
                seats_s-=seats_booked;
                if(seats_s<0 )
                {
                    System.out.println("Sorry all seats are booked for Sholay");
                    seats_s-=seats_booked;
                    break;
                }
                System.out.println("Your tickets are booked\n"+"Enjoy ur day");
                pout.println("Name : "+name);
                pout.println("Move : Sholay");
                pout.println("Seats booked : "+seats_booked);
                pout.println("Price : "+"\u20B9"+pricep);
                System.out.println("Seats left : "+seats_s);
                pout.println("================================================");
                break;
                default: System.out.println("WRONG CHOICE");
            }
        }
        pout.close();
    }
}