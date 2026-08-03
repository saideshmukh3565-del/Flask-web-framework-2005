import java.util.Scanner;
public class rectangle
{
	int length,breadth;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length:");
		length=sc.nextInt();
		System.out.print("Enter Breadth:");
		breadth=sc.nextInt();
	}
	void area()
	{
		System.out.println("Area="+(length+breadth));
	}
	void perimeter()
	{
		System.out.println("Perimeter="+(2*(length+breadth)));
	}
} 

public class main
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		r.accept();
		r.area();
		r.perimeter();
	}
}
