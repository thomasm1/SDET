import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cli {
    public static void main(STring args[]) throws UnknownHostException, IOException
    {
        int number.temp;
        Scanner sc= new Scanner(System.in);
        Socet s = new Socket("1.27.0.0.1",1326);
        Scanner sc1=new Scanner(s.getInputStream());
        System.out.prinln("Enter any numba!!");
        number= sc.nextInt();
        PrintStream p= new PrintSTreamk(s.getOutputStream());
        p.println(number);
        temp= sc1.nextInt();
        System.out.println(temp);
    }
}