import java.util.Scanner;
public class book
{
	int id;
	String name;
	String author;
	double price;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Book ID:");
		id=sc.nextInt();
		sc.nextline();
		System.out.print("Enter Book Name:");
		name=sc.nextline();
		System.out.print("Enter Author Name:");
		author=sc.nextLine();
		System.out.print("Enter Price:");
		price=sc.nextDouble();
	}
	void display()
	{
		System.out.println("\nBook ID:"+id);
		System.out.println("Book Name:"+name);
                System.out.println("Author Name:"+author);
                System.out.println("Price:"+price);
	}
	public class book
	{
		public static void main(String args[])
		{
			book b=new book();
			b.accept();
			b.display();
		}
	}
}
