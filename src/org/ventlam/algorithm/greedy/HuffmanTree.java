package org.ventlam.algorithm.greedy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class HuffmanTree implements Comparable<HuffmanTree>{
	/*
	 *@param value the value stored in node 
	 *@param left left child of the tree
	 *@param right right child of the tree
	 *@param frequency the frequency of value
	 */
	public Character value;
	public HuffmanTree left;
	public HuffmanTree right;
	public double frequency;
	PriorityQueue<HuffmanTree> huffQ;
	/** Create a leaf node with the specified value and frequency. **/
	public HuffmanTree(Character invalue,double freq)
	{
		this(invalue,freq,null,null);
	}
	/**Constructed a non-value  0-frequency leaf node**/
	public HuffmanTree()
	{
		this(null,0.0);
	}
	/**Constructed  a new  Huffman tree**/
	public HuffmanTree(Character invalue,double freq ,HuffmanTree left,HuffmanTree right)
	{
		this.value=invalue;
		this.frequency=freq;
		this.left=left;
		this.right=right;
	}
	
		private static HashMap<Character, Integer> charCount(String codestring)
		{
			HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
			for(int i=0;i<codestring.length();i++)
			{
				char a =codestring.charAt(i);
				if(!hashmap.containsKey(a))
				{
					hashmap.put(a, 1);
				}
				hashmap.put(a, hashmap.get(a)+1);
			}
			return hashmap;
		}
		/*
		 * Build Tree from Frequency Table
		 * @param freq The occur time of specified char
		 * @return a Huffman tree containing the characters' prefix codes 
		 */
		public  void bulidTree()
		{
			HuffmanTree left,right,parent;
			while(this.huffQ.size()>1)
			{   
				left=huffQ.remove();
				right=huffQ.remove();
				parent=new HuffmanTree(null,left.frequency+right.frequency);
				huffQ.add(parent);
			}
					}
		public void arraylistHuffman(List<HuffmanTree> HuffmanTrees)
		{
			while (HuffmanTrees.size() > 1)  
		{
				sort(HuffmanTrees);  
	            //获取权值最小的两个节点  
				HuffmanTree left = HuffmanTrees.get(HuffmanTrees.size() - 1);  
				HuffmanTree right = HuffmanTrees.get(HuffmanTrees.size() - 2);  
	            //生成新节点，新节点的权值为两个子节点的权值之和  
				HuffmanTree parent = new HuffmanTree(null , left.frequency + right.frequency);  
	            //让新节点作为权值最小的两个节点的父节点  
	            parent.left = left;  
	            parent.right = right;  
	            //删除权值最小的两个节点  
	            HuffmanTrees.remove(HuffmanTrees.size() - 1);  
	            HuffmanTrees.remove(HuffmanTrees.size() - 1);  
	            //将新生成的父节点添加到集合中  
	            HuffmanTrees.add(parent);  
		}
		
		
		
	    }
		private void sort(List<HuffmanTree> huffmanTrees) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public int compareTo(HuffmanTree arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
}
	/*public void arraylistHuffman()
	{
	ArrayList al = new ArrayList();
	HashMap<Character, Integer> hm =charCount("fuckyouyou");
	Collection<Integer> c = hm.values();
	Iterator it =c.iterator();
	while(it.hasNext())
	{
		al.add(it.next());
	}
	
}*/