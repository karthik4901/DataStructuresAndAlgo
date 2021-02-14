package com.ds.algo.com;

public class MyLinkedList {
	
	Node head;
	
	

	public static void main(String[] args) {
		
		MyLinkedList llist = new  MyLinkedList();
		
		Node first = new Node(1);
		Node second = new Node(2);
		Node third  = new Node(3);
		
		llist.head = first;
		first.next = second;
		second.next = third;
		llist.insertElement(4);
		llist.insertElementByPosition(second,5);
		System.out.println("length of the list "+llist.lListLength(llist));
		llist.printMyLinkeddList(llist);
	}
	
	
	public void insertElement(int data) {
		
		Node new_element = new Node(data);
		
		new_element.next = head;
		
		head = new_element;
		
		
}
	
	public void insertElementByPosition(Node before,int data) {
		
		Node new_el = new Node(data);
		new_el.next = before.next;
		before.next = new_el;
		
	}
	
	public void printMyLinkeddList(MyLinkedList list) {
		
		Node n = list.head;
		
		while(n != null) {
			System.out.println("data is"+ n.data);
			n = n.next;
			/*
			 * if(n.next == null) { break; }
			 */
		}
		
	}
	
	
	public int lListLength(MyLinkedList list) {
		
		int n = 1;
		
		if(head == null) {
			return 0;
		}
		Node node = list.head;
		
		if(node.next == null) {
			return 1;
		}
		
		while(node.next != null) {
			
			node = node.next;
			n++;
		}
		return n;
		
	}

}
