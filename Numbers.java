import java.util.*;
import java.lang.*;
import java.io.*;
class Numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		try{
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t==0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int c,d,div=1;
            int y=n%2;
            //System.out.println(y);
            if(y==0){
                if(a>=b){
                div=a/b;
                }
                else{
                    div=b/a;
                }
               // System.out.println(div);
            }
            else{
                c=a*2;
                d=b;
                if(c>=d){
                div=c/d;
                }
                else{
                    div=d/c;
                }
            }
        
                
            System.out.println(div);
        }
		}catch(Exception e){}
	}
}
