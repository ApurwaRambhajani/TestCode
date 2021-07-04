import java.util.*;
import java.lang.*;
import java.io.*;


class Ships
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t==0)
		{
		    char ch1 = sc.next().charAt(0);
		    if(ch1 == 'b' || ch1 == 'B')
		        System.out.println("BattleShip");
	        else if(ch1 == 'c' || ch1 == 'C')
	            System.out.println("Cruiser");
            else if(ch1 == 'd' || ch1 == 'D')
                System.out.println("Destroyer");
            else if(ch1 == 'f' || ch1 == 'F')
                System.out.println("Frigate");
		}
	}
}
