package org.ventlam.algorithm.graph;

public class SimpleGraphTraversal {

	/**
	 * @param args
	 */
	SimpleGraph smpGraph;
	public void  graphDFS()
	{
		
		smpGraph.vertList[0].wasVisited=true;
		smpGraph.showVertex(0);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
