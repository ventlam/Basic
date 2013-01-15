package org.ventlam.algorithm.recursion;

public class Fibonacci {

	public long recursionFin(int n)
	{
		if(n<=2)
		{
			return 1;
		}
		else
		{
			return recursionFin(n-1)+recursionFin(n-2);
		}
	}
	
	public long iterFin(int n)
	{
		long temp=0,res=1 ;
		
			for(int i=1;i<n;i++)
			{
				res=res+temp;
				temp=res-temp;
			}
			return res;	
	}
	public long formulateFin(int n)
	{
		 double z = Math.sqrt(5.0);
	     double x = (1 + z)/2;
	     double y = (1 - z)/2;
	     return (long) ((Math.pow(x, n) - Math.pow(y, n))/z + 0.5);
		
	}
}
