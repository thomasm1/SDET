
public class cli {
	public static void main(String args[]) throws UnknownHostException,
	{
int number,tem;
Scanner sc= new Scanner(System.in);
Socket s = new Socket("127.0.0.1",1326);
Scanner sc1= new Scanner(s.getInputStream());
Systemk.out.prinln("Enter any number");
number = sc.nextInt();
PrintStream p= new PrintStream(s.getOutputStream());
p.println(number);
temp=sc1.nextInt();
System.out.println(temp);
}
}
