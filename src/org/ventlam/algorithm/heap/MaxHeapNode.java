/**
 * @author VentLam
 * @email ventlcc@gmail.com
 * @date  Jan 24, 201310:53:17 PM
 * @version 0.1
 */
package org.ventlam.algorithm.heap;

/**
 * @author vent ventlam
 * @date 10:53:17 PM
 * @version 
 */
public class MaxHeapNode {
      private int data; //堆结点值
     
      public MaxHeapNode(int key)
      {
    	  data = key;
      }
      /*
       * set key
       *@param key
       */
      public void setKey(int key)
      {
    	  data =key;
      }
      /*
       * set key
       *@param key
       */
      public int getKey()
      {
    	  return data;
      }
}
