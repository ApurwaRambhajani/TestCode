import java.util.*;
import java.lang.*;
import java.io.*;



public class Cats
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int t;
	Scanner sc=new Scanner(System.in);
	t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
	   long c=sc.nextInt();
	   long d=sc.nextInt();
	   long l=sc.nextInt();
	   long sum=0;
	   if(c>d*2){
	       sum=c-2*d;
	   }
	   if(l>=(d+sum)*4 && l<=(c+d)*4 && l%4==0){
	       System.out.println("yes");
	   }
	   else{
	       System.out.println("no");
	   }
  }
}
}
