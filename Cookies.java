import java.util.*;
import java.lang.*;
import java.io.*;


class Cookies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t==0)
		{
		    int n=sc.nextInt();
		    String s[]=new String[n];
		    for(int i=0;i<n;i++)
		    {
		        s[i]=sc.next();
		    }
		    int c=0;
		    for(int i=0;i<n-1;i++)
		    {
		        if(s[i].equals("cookie") && s[i+1].equals("cookie"))
		        {
		            c=1;
		            break;
		        }
		    }
		    if(s[n-1].equals("cookie"))
		        c=1;
		    if(c==1)
		        System.out.println("NO");
		    else
		        System.out.println("YES");
		}
	}
}
