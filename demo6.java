import java.io.*;
public class demo6
{
	public static void main(String arg[])
	{
		int n=5,fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("fact"+fact);
	}
}

