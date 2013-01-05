package org.ventlam.algorithm.dviconquer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	protected static BinaryTreeNode root;
	public BinaryTree ()
	{
		root=null;
	}
	protected void visit (BinaryTreeNode btn)
	{
		System.out.println(btn.key + "----- ");
	}
	public void insert (int newdata)
	{
		root=insert(root,newdata);
	}
	/*
	 * 将数值插入到二叉树中，比当前结点小或等于当前结点的插在当前结点的左侧，比当前结点大的数插在当前结点的右侧，
     * @param btn  当前的结点，就是根结点，只是每次根结点的左右子孙更新 
     * @param newdata  要插入的数值 
     * @return  新排好的二叉树节点
	 */
	public BinaryTreeNode insert(BinaryTreeNode btn,int newdata)
	{
		//空树可以直接构建
		if (btn ==null)
		{	
			btn =new BinaryTreeNode(newdata);
			}
		//选择恰当的位置插入，从根节点开始递归
		else
		{
			if(newdata<=btn.key)
			{
				btn.left=insert(btn.left,newdata);
			}
			else
			{
				btn.right=insert(btn.right,newdata);
			}
		}
		return (btn);
	}
	/*
	 * 用数组构建二叉树
	 */
	public void  buildTree (int[] datas)
	{
		for(int i=0;i<datas.length;i++)
		{
			insert(datas[i]);
		}
	}
	public void printTree()
	{
		printTree(root);  
		System.out.println();
	}
	public void printTree(BinaryTreeNode btn) {
		// TODO Auto-generated method stub
		if (btn == null)
			return ;
		else
			printTree(btn.left);
			System.out.print(btn.key+" ");
			printTree(btn.right);
	}
	public void search(int newdata)
	{
		search(root, newdata);
		System.out.println(root.key);
	}
	/*public BinaryTreeNode search(BinaryTreeNode btn,int newdata)
	{
		 while(btn!=null)
		 {
			 if(newdata==btn.key)
			 {	 
				 return btn;
				 }
			 else if(newdata < btn.key)
				// search(btn.left,newdata);
				 btn=btn.left;
			 else 
				 //search(btn.right,newdata);
				 btn=btn.right;
			}
		 return null;
			 
	}*/
	public void search(BinaryTreeNode btn,int newdata)
	{
		while(btn!=null)
		{
			if(newdata==btn.key)
			{
				System.out.print(btn.key);
			}
			else if (newdata<btn.key)
			{
				search(btn.left,newdata);
			}
			else 
				search(btn.right,newdata);
		}
	}
	public void breadthFirst()
	{
		BinaryTreeNode p =root;
		Queue<BinaryTreeNode> queue  = new LinkedList<BinaryTreeNode>();
		if(p!= null)
		{
			 //将指定的元素插入此队列
			queue.offer(p);
			//queue.add(root);
			while(!queue.isEmpty())
			{
			//获取并移除此列表的头（第一个元素）
			 p=queue.poll();
			 visit(p);
			 if(p.left!=null)
			 {
				 queue.offer(p.left);
			 }
			 if(p.right!=null)
			 {
				 queue.offer(p.right);
			 }
			}
		}
	}
	//递归前序深度优先遍历
	public void deepFirstPreOrdeer(BinaryTreeNode p)
	{
		 //p =root;
		//Queue<BinaryTreeNode> queue  = new LinkedList<BinaryTreeNode>();
		if(p!=null)
		{
			visit(p);
			deepFirstPreOrdeer(p.left);
			//System.out.println("DFSPre");
			deepFirstPreOrdeer(p.right);
		}
	}
	//迭代前序深度优先遍历
	public void iterDeeepFirsrtPre()
	{
		BinaryTreeNode p =root;
		Stack<BinaryTreeNode> stack  = new Stack<BinaryTreeNode>();
		if(p!=null)
		{
			stack.push(p);
			while(!stack.isEmpty())
			{
				
				p=stack.pop();
				visit(p);
				//LIFO
				if(p.right!=null)
				{
					stack.push(p.right);
				}
				if(p.left!=null)
				{
					stack.push(p.left);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] datas = {13,10,25,2,12,20,31,29};
		BinaryTree bt = new BinaryTree();
		bt.buildTree(datas);
		bt.printTree();
		//bt.search(15);
		//bt.breadthFirst();
		BinaryTreeNode p = root;
		//bt.deepFirstPreOrdeer(p);
		bt.iterDeeepFirsrtPre();
	}
}
