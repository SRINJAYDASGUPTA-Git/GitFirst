import java.io.*;
import java.util.*;
public class Registration {
    public void Input() throws IOException{
        String file = "reg.txt";
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter p =new PrintWriter(bw);
        Scanner in =new Scanner(System.in);
        DataOutputStream d = new DataOutputStream(new FileOutputStream("Fee.dat"));
        DataInputStream din = new DataInputStream(new FileInputStream("Fee.dat"));

        try {
            System.out.println("Enter the no. of students");
            int n1 = in.nextInt();
            for(int i =1; i<=n1;i++) {
                System.out.println("Enter the name of the student");
                String n = in.next();
                System.out.println("Enter the roll no.");
                int roll = in.nextInt();
                System.out.println("Enter the Class(in numbers)");
                int c = in.nextInt();
                int fee = 0, o;
                if (c == 3 || c == 4) {
                    fee = 200;
                    if(roll == 1){
                        d.writeInt(fee);
                    }
                    else {
                        o = din.readInt();
                        int f = o+fee;
                        d.writeInt(f);
                    }
                }
                if (c == 5 || c == 8) {
                    fee = 250;
                    if(roll == 1){
                        d.writeInt(fee);
                    }
                    else {
                        o = din.readInt();
                        int f = o+fee;
                        d.writeInt(f);
                    }
                }
                if (c == 9 || c == 10) {
                    fee = 300;
                    if(roll == 1){
                        d.writeInt(fee);
                    }
                    else {
                        o = din.readInt();
                        int f = o+fee;
                        d.writeInt(f);
                    }
                }
                if (c == 11 || c == 12) {
                    fee = 350;
                    if(roll == 1){
                        d.writeInt(fee);
                    }
                    else {
                        o = din.readInt();
                        int f = o+fee;
                        d.writeInt(f);
                    }
                }

                p.println(n + "    " + c + "              " + fee);
        //p.println("Name                 Class              Fee");
            }
            p.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void Output()throws IOException{
        DataInputStream di = new DataInputStream(new FileInputStream("Fee.dat"));
        int r = di.readInt();
        System.out.println(r);
    }
    public static void main(String[] args){
        Registration ob = new Registration();
        try {
            ob.Input();
            ob.Output();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
