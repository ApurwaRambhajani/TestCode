import java.util.Scanner;

public class Salary 
{
    	public static void main( String[] args ) 
    	{
		Scanner reader = new Scanner(System.in);
	
		float bs, gs, da, hra;
                                   
                                     //Accepting the basic Salary

		System.out.print("\nEnter basic salary:");
		bs = reader.nextFloat();
	
		if (bs<1500)
		{
			hra = bs * 10 / 100;
			da = bs * 90 / 100;
		}
		else
		{
			hra = 500;
			da = bs * 98 / 100;
		}
		gs = bs + hra + da;
		System.out.print("\nGross salary = Rs." + gs);
    }

}