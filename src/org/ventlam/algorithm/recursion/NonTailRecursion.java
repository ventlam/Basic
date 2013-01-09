package org.ventlam.algorithm.recursion;

public class NonTailRecursion {

	public String recursiveReverse(String s)
	{	
		if(s.length()<=1)
		{
			return s;
		}
		return recursiveReverse(s.substring(1))+s.charAt(0);
		/*char ch = getChar(s);
		if(ch!='\n')
			recursiveReverse(s);
		System.out.println();*/
		
	}

	/*private char getChar(String s) {
		// TODO Auto-generated method stub
	   if(s.length()<=1)
		   return s.charAt(0);
		char ch = s.charAt(0);
		return ch;
	}*/
	public static void main(String[] args)
	{
		String s="abc";
		NonTailRecursion nsRec = new NonTailRecursion();
		System.out.println(nsRec.recursiveReverse(s));
	}
}
