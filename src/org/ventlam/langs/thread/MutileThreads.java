/**
 * @author	VentLam 
 * @date	Feb 2, 2013
 * @version 0.1
 */
package org.ventlam.langs.thread;

/**
 * 
 */
public class MutileThreads extends Thread{
	/*
	 * Thread 实现多线程
	 * 结果不可预期 ，why？
	 */
	private String name;
	public MutileThreads(String name)
	{
		super(name); 
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			 // for(long k= 0; k <100000000;k++); //延时
	            System.out.println(this.getName()+" :"+i); 
		}
	}
	public static void main(String[] args)
	{
		MutileThreads t1 = new MutileThreads("Vent");
		MutileThreads t2 = new MutileThreads("Vivi");
		t1.start();
		t2.start();
		
	}
}
