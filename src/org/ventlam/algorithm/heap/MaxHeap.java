/**
 * @author VentLam
 * @email ventlcc@gmail.com
 * @date  Jan 24, 201310:56:00 PM
 * @version 0.1
 */
package org.ventlam.algorithm.heap;


public class MaxHeap {

	/**
	 * @param args
	 */
	private MaxHeapNode[] maxHeapAry; //使用数组构建堆
	private int heapMaxSize ;//堆的最大size
	private int heapCurrentSize; //堆的当前size
	public MaxHeap(int size)
	{
		maxHeapAry=new MaxHeapNode[size];
		heapMaxSize=size;
		heapCurrentSize=0;
	}
	public  void JhonWillamDown(int top,int end)
	{
		int root=top;
		int leaf=2*root+1;
		MaxHeapNode temp =maxHeapAry[root];
		while(leaf<=end)
		{
			if(maxHeapAry[leaf].getKey()>maxHeapAry[leaf+1].getKey())
				{
				leaf++;
				}
			if(temp.getKey()>maxHeapAry[leaf].getKey())
			{
				break;
			}
			else
			{
				maxHeapAry[root]=maxHeapAry[leaf];
				root=leaf;
				leaf=leaf*2+1;
			}
			maxHeapAry[root]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
