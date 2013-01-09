package org.ventlam.algorithm.recursion;

public class NonTailRecursion {

	public void recursiveReverse()
	{
		char ch = getChar();
		if(ch!='\n')
			recursiveReverse();
		System.out.println();
		
	}

	private char getChar() {
		// TODO Auto-generated method stub
	   String s= "fuckyou!";
		char aChar = s.charAt(9);
		return 0;
	}
}
