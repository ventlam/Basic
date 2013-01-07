/*
 * @author ventlam
 * @date Jan7 2013
 * 顶点类
 */
package org.ventlam.algorithm.graph;

public class Vertex {
	public char label;
	public boolean wasVisited;
	
	public Vertex(char lab)
	{
		label=lab;
		wasVisited=false;
	}
}
