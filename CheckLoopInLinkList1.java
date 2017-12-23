//Java program for Check, whether Link List has a Loop Using BRUTEFORCE APPROACH
//So here we are traversing the List Once to check loop-> Time Comp(In Worst Case)->O(N)

package Singly_Linked_List;

import java.util.Scanner;

public class CheckLoopInLinkList1{

	Node head;
	int count;
	
	static class Node
	{
	  int data;
	  Node next;
	  
	  Node(int data)
	  {
		  this.data=data;
		  next=null;
	  }
	}

	void printinglist(Node headreference)
	{
		if(headreference==null)
		{
			return;
		}
		
		//current pointing to the head node
		Node current=headreference;
		
		//traversing whole list while "null" is not encountered
		while(current!=null)
		{
			System.out.print(current.data+"-> ");
			count++;
			//Checking if last node pointing again back to first
			if(current.next==headreference)
			{
				System.out.println("\nThere is loop is linked list "+current.data+" is pointing back to "+headreference.data);
                return;
			}
			
			//incrementing the next current's next after checking whether loop occurs or not, so that last node(where loop is occuring) gets printed 
			current=current.next;
			
		}
		
		//here current becomes null
		System.out.println(current);
		System.out.println("length of Linked List is "+count);
		
		}
	
	public static void main(String[]args)
	{
		CheckLoopInLinkList1 first=new CheckLoopInLinkList1();
		first.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		Node fifth=new Node(50);
		Node sixth=new Node(60); 
		
		first.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth; 
		
		//Here Loop Occurs
		sixth.next=first.head;
		
		new CheckLoopInLinkList1().printinglist(first.head);
       
}	        
}	