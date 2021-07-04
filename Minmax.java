import java.util.*;
import java.lang.*;
import java.io.*;


class Minmax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Accepting the values
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t==0)
		{ int i;
		    int  n=sc.nextInt();
		    long a[]=new long[n];
		    for(i=0;i<n;i++)
		    {
		         a[i]=sc.nextInt();
		    }
//Sorting the array
		    Arrays.sort(a);
		    System.out.println(a[0]*(n-1));
		}
	}
}