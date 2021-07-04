import java.util.*;
import java.lang.*;
import java.io.*;


class Temple
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		while(t==0){
		    int n= sc.nextInt();
		    int []arr =new int [n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        
		    }
		    int count=0;
		    int count1=0;
		    for(int i =0;i<n/2;i++){
		        if(arr[i+1]-arr[i]==1 && arr[0]==1){
		            count++;
		        }
		    }
		        for(int i=n/2;i<n-1;i++){
		            if(arr[i]-arr[i+1]==1){
		                count1++;
		            }
		            
		        }
		        if(count==n/2 && count1 ==n/2){
		            System.out.println("yes");
		        }
		        else{
		            System.out.println("no");
		        }
		    
		}
	}
}
