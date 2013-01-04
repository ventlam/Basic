package org.ventlam.algorithm.dviconquer;

public class BinaryTreeNode {
	/*
	 * 根节点，左右子节点
	 */
	protected int key;
	protected BinaryTreeNode right,left;
	// 空树
	public BinaryTreeNode()
	{
		left=right=null;
		
	}
	//只有根节点
	public BinaryTreeNode(int el)
	{
		this(el,null,null);
		
	}
	//
	public BinaryTreeNode(int data,BinaryTreeNode lt,BinaryTreeNode rt)
	{
		key=data;
		left=lt;
		right=rt;
	}
	
	
}
