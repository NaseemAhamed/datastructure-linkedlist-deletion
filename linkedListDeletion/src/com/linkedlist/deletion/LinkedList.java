package com.linkedlist.deletion;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Inserts a new node at front of the list */
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	/*Prints the list*/
	public void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	/*Deleting a specific node*/
	
	public void deleteNode(int data)
	{
		Node current=head;
		Node prev=null;
		
		/*If head node itself contains the data to be deleted, point current.next to head*/
		if(current!=null && current.data==data)
		{
			head=current.next;
			return;
		}
		
		while(current!=null && current.data!=data)
		{
			prev=current;
			current=current.next;
			
		}
		
		if(current==null) return;		//Edge case
		
		prev.next=current.next;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.printList();
		System.out.println("\nDeleting node 20");
		list.deleteNode(20);
		list.printList();
	}

}

