import java.io.*;
public class salary
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       try{
		       System.out.print("Enter Basic Salary:");
			double basic=Double.parseDouble(br.readLine());
			double hra=basic*0.20;
			double da=basic*0.10;
			double gross=basic+hra+da;
			double net=gross;
			System.out.println("HRA="+hra);
			System.out.println("DA="+da);
			System.out.println("Gross="+gross);
			System.out.println("NET="+net);
	       }catch (IOException e){
		       System.out.println("An error occurred while reading input: " + e.getMessage());
	       }
	}
}
 	      
