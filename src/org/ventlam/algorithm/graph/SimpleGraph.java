/*
 * @author ventlam
 * @date Jan7 2013
 * 简单图类
 */
package org.ventlam.algorithm.graph;

import java.util.Stack;

public class SimpleGraph {
	private final int MAX_VERTS=1024;
	 private Vertex vertList[]; // 存放顶点的数组 
	private int adjMaxs[][]; //邻接矩阵
	private int nVerts ;  //当前顶点数
	private Stack<Integer> stack;
	//图的邻接矩阵
	public SimpleGraph()
	{
		vertList =new Vertex[MAX_VERTS];
		adjMaxs = new int[MAX_VERTS][MAX_VERTS];
		nVerts=0;
		for(int i=0;i<MAX_VERTS;i++)
		{
			for(int j=0;j<MAX_VERTS;j++)
			{	
				adjMaxs[j][i] = 0;  
				
			}
		}
		stack = new Stack<Integer>();
	}
	
}
