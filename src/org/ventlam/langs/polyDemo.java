package org.ventlam.langs;

public class polyDemo {
     public static void m(Object x)
     {
    	 System.out.println(x);
     }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(new Object());
        m(new Person());
        m(new Student());
        m(new GradulateStudent());
	}

}
