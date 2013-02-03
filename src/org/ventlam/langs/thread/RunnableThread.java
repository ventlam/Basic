/**
 * @author	VentLam 
 * @date	Feb 3, 2013
 * @version 0.1
 */
package org.ventlam.langs.thread;

/**
 * 实现Runnable接口，实现run方法，
 * 分配类实例，创建Thread作为参数传递并启动。
 */
public class RunnableThread implements Runnable{

	private String name;
	public RunnableThread(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			 // for(long k= 0; k <100000000;k++); //延时
	            System.out.println(this.name+" :"+i); 
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      RunnableThread rt1 = new RunnableThread("vent");
      RunnableThread rt2 = new RunnableThread("vivi");
      new Thread(rt1).start();
      new Thread(rt2).start();
	}

}
