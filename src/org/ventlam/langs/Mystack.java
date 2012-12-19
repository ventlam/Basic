package org.ventlam.langs;

public class Mystack {

	/**
	 * @param args
	 */
	private java.util.List mylist = new java.util.ArrayList();
	public boolean isEmpty()
	{
		return mylist.isEmpty();
	}
	public int getSize()
	{
		return mylist.size();
	}
	public Object peek()
	{
		return mylist.get(mylist.size()-1);
	}
	public Object pop()
	{
		Object last = mylist.get(mylist.size()-1);
		mylist.remove(mylist.size()-1);
		return last;
	}
	public Object push(Object x)
	{
		mylist.add(x);
		return x;
	}
	public int search(Object x)
	{
		int i = mylist.lastIndexOf(x);
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
