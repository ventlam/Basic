package org.ventlam.algorithm.dviconquer;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {
 
	
	protected BinaryTreeNode root;
	public void breadthFirst()
	{
		BinaryTreeNode p =root;
		Queue<BinaryTreeNode> queue  = new LinkedList<BinaryTreeNode>();
		if(p!= null)
		{
			queue.offer(p);
			//queue.add(root);
			while(!queue.isEmpty())
			{
			 p=queue.poll();
			 //visit(p);
				
			}
		}
	}
}
