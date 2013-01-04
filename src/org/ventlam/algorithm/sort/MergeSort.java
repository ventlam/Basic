package org.ventlam.algorithm.sort;

import java.util.Arrays;

public class MergeSort {
		
	  private  void mergesort(int[] data ,int first, int last)
	  {
		  if (first <last)
		  {
			  int mid=(first+last)/2;
			  mergesort(data,first,mid);
			  mergesort(data,mid+1,last);
			  //merge(data,first,last);
			  merge(data,first,mid,last);
			  print(data);
		  }
	  }
  private void merge(int[] data ,int first ,int mid,int last)
  {
	  int i,j,k;
	  int n1=mid-first+1;
	  int n2=last-mid;
	  int[] Ldata =new int[n1+1] ;
	  //System.out.println(Ldata.length);
	  int[] Rdata = new int[n2+1] ;
	  //复制数据，并添加哨兵牌
	  for(i=0;i<n1;i++)
	  {
		  Ldata[i]=data[first+i];
		 
	  }
	  Ldata[i]=Integer.MAX_VALUE;
	 // print(Ldata);
	  for(i=0;i<n2;i++)
	  {
		 Rdata[i]=data[mid+i+1];
	  }
	  Rdata[i]=Integer.MAX_VALUE;
	 
	 // print(Rdata);
	  i=j=0;
	  
		for(k=first;k<=last;k++)
		{
			if(Ldata[i]<= Rdata[j])
			{
				data[k]=Ldata[i++];
				//i++;
			}
			else 
			{
				data[k]=Rdata[j++];
				//j++;
			}
		}	
	
	 // print(data);
  }
	private void merge(int[] data, int first, int last) {
		// TODO Auto-generated method stub
		 int mid=(first+last)/2;
		 int i=first;
		 int il=first;
		 int ir=mid+1;
		 int [] temp = new int[data.length];
		/*
		 * 采用传递索引，依然使用原数组，关键是比较数组索引，每次只比较一个
		 * 算法导论中采用两个数组加入哨兵牌的方法 Integer.MAX_VALUE
		 */
		 while(il<= mid && ir<=last)
		 { 
			 if (data[il] <= data[ir])
			   {
				 temp[i++] =data[il++];
				print(temp);
				}
		   else 
			   {
			   temp[i++]=data[ir++];
				print(temp);
				}
		 }
		 // 剩余部分放入临时数组
		 //由于ir++，所以剩余左数组，执行下面语句
		 while(il <= mid)
		 {
			 temp[i++]=data[il++];
			 print(temp);
			 }
		 while(ir <= last )
		 {
			 temp[i++] =data[ir++];
			 print(temp);
			 }
	
	
		 //将temp内容载入data
		 while(i <= last)
		 { 
			 data[i]=temp[i++];
			 print(temp);
			 }
	}
	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int[] data ={11,24,5,16};
		print(data);
		int first=0;
		int last=data.length-1;
		MergeSort ms =new MergeSort();
		ms.mergesort(data, first, last);
		System.out.println("排序后的数组：");
		print(data);
	}
}
