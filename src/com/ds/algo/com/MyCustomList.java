 package com.ds.algo.com;

public class MyCustomList {
	
	private int[] items;
	private int count;
	
	
   public MyCustomList(int count) {
	   items = new int[count];
   }
   
  public void add(int item) {
	  
	  //checking the size 
	  if(items.length == count) {
		  int[] newItems =new int[count*2];
	  //copying all the elements to  new array
	  for(int i= 0; i< count;i++) {
		  newItems[i] = items[i];
	   }
	    //copy old entire list new list
	    items = newItems;
	  }
	  //
	  items[count++] = item;  
  }
  
  
  public void removeAt(int index) {
	  
	  if(index < 0 || index>=count) {
		  throw new IllegalArgumentException();
	  }
	  for(int i = index; i<count; i++) {
		  items[i]  =items[i+1];
	  }
	  
	  count--;
  }
  
  public static void main(String[] args) {
	
	  MyCustomList list = new MyCustomList(3);
	  list.add(1);
	  list.add(3);
	  list.add(4);
	  list.add(5);
	  list.removeAt(1);
}

}
