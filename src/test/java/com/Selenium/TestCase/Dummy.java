package com.Selenium.TestCase;

import java.util.Scanner;

public class Dummy {	
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    int n=sc.nextInt();
	    int s=sc.nextInt();
	    int a[]=new int[n];
	    for(int  i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        int sum=0;
	        for(int j=i;j<n;j++){
	            sum+=a[j];
	        int flag=0;
	        
	        if(sum==s){
	            int st=i+1;
	            int en=j+1;
	            System.out.println(st+" "+en);
	            i=n+1;
	            
	            
	            
	        }
	        if(i==n-1){
	        	System.out.println("-1");
	        }
	       
	        }
	    }
	}
}

}
