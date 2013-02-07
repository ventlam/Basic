/**
 * 
 */
package org.ventlam.langs.thread;

/**
 * @author vent
 *
 */
public class ThreadSleep extends Thread{

	/**
	 * @param args
	 */
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			if((i)%10==0)
			{
				System.out.println("--------------"+i);
			}
			try {
				Thread.sleep(5);
				System.out.println(i+": Thread sleep 5 milliseconds");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleep ts = new ThreadSleep();
		ts.start();
	}

}
