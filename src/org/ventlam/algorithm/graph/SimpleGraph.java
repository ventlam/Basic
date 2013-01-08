/*
 * @author ventlam
 * @date Jan7 2013
 * 简单图类
 */
package org.ventlam.algorithm.graph;

import java.util.Stack;

public class SimpleGraph {
	protected final int MAX_VERTS=1024;
	protected Vertex vertList[]; // 存放顶点的数组 
	protected int adjMaxs[][]; //邻接矩阵
	protected int nVerts ;  //当前顶点数
	protected Stack<Integer> stack;
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
	public void addVertex(char lab)
	{
		Vertex newVertex = new Vertex(lab);
		vertList[nVerts++]=newVertex;
	}
	public void addEdge(int start,int end)
	{
		adjMaxs[start][end]=1;
		adjMaxs[end][start]=1;
	}
	public void showVertex(int v)
	{
		System.out.println(vertList[v].label);
	}
	public void  graphDFS()
	{
		
		vertList[0].wasVisited=true;
		showVertex(0);
		stack.push(0);
		while(!stack.isEmpty())
		{
			int v=getUnvistVert(stack.peek());
			if(v==-1)
				stack.pop();
			else
			{
				vertList[v].wasVisited=true;
				showVertex(v);
				stack.push(v);
			}
		}
	}
	//从邻接矩阵中判断顶点v是否有未访问过的邻接点  
	public int getUnvistVert(int v)
	{
		for (int i=0;i<nVerts;i++)
		{
			if(adjMaxs[v][i]==1&&vertList[i].wasVisited==false)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGraph smGraph = new SimpleGraph();
		  smGraph.addVertex('A');    // 0  (start for dfs)  
		  smGraph.addVertex('B');    // 1  
		  smGraph.addVertex('C');    // 2  
		  smGraph.addVertex('D');    // 3  
		  smGraph.addVertex('E');    // 4  
	  
		  smGraph.addEdge(0, 1);     // AB  
		  smGraph.addEdge(1, 2);     // BC  
		  smGraph.addEdge(0, 3);     // AD  
		  smGraph.addEdge(3, 4);     // DE  
		  System.out.print("Visits: ");  
		  smGraph.graphDFS();
		  System.out.println();  
	}
}
