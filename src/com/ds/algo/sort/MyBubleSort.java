package com.ds.algo.sort;

public class MyBubleSort {
	
	
	
	public static void  printSortedArray(int[] array) {
		
		 boolean isSorted = false;
		 int lastUnsorted = array.length-1;
		 
		 while(!isSorted) {
			 isSorted = true;
			 for(int i= 0; i<lastUnsorted;i++) {
				 
				 if(array[i]>array[i+1]) {
					 swap(array,i,i+1);
					 isSorted = false;
				 }
			 }  
			 
			 lastUnsorted--;
		 }
		
 		 System.out.println("sorted Array  "+array.toString());
		
	}
	

	private static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}


	public static void main(String[] args) {
		
		int [] unSortNumber = {6,2,5,3,4,1};
		printSortedArray(unSortNumber);
		
		
	}

}
