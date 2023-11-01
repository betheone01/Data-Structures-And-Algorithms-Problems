
import java.io.*; 

//Java program to implement 
//a Singly Linked List 
public class LinkedList 
{ 

	 Node head; // head of list 

 // Linked list Node. 
 // This inner class is made static 
 // so that main() can access it 
	 static class Node 
	 { 
	
	     int data; 
	     Node next; 
	
	     // Constructor 
	     Node(int d) 
	     { 
	         data = d; 
	         next = null; 
	     } 
	 }
	 
	 public static LinkedList insert(LinkedList list,int data)
	 {
	 	 Node newnode=new Node(data);
	 	 
	 	if(list.head == null) 
	 	{
	 		list.head=newnode;
	 		
	 	}
	 	else 
	 	{
	 		Node last=list.head;
	 		while(last.next !=null)
	 		{
	 			last=last.next;
	 			
	 		}
	 		last.next=newnode;
	 	}
	 	return list ;
	 }
	 public static LinkedList InsertAtHead(LinkedList list,int data)
	 {
		 Node temp=new Node(data);
		 
		 temp.next=list.head;
		 list.head=temp;
		
		 return list;
		 
	 }
	 public static int sizeOFll(LinkedList list)
	 {
		 Node temp=list.head;
		 int count=0;
		 while(temp!=null)
		 {
			 count++;
			 temp=temp.next;
		 }
		 return count;
		 
	 }
	 public static LinkedList InsertAtMid(LinkedList list,int data)
	 {
		int count=sizeOFll( list);
		System.out.println(count);
		int mid=count/2;
		System.out.println(mid);
		int position=1;
		Node temp=list.head;
		Node newnode=new Node(data);
		
		
		while(position !=mid)
		{
			position++;
			temp=temp.next;
		}
		System.out.println("Position "+position);
		newnode.next=temp.next;
		temp.next=newnode;
		
		
		 return list;
	 }
	 
	 public static LinkedList InsertAtEnd(LinkedList list ,int data)
	 {
		 int size=sizeOFll( list);
		 Node temp=list.head;
		 Node newnode=new Node(data);
		 int position=1;
		 while(position !=size)
		 {
			 position++;
			temp=temp.next; 
		 }
		 newnode.next=temp.next;
		 temp.next=newnode;
		 return list;
		 
		 
	 }
	 public static int serach(LinkedList list,int key)
	 {
		 int size=sizeOFll( list);
		 Node temp=list.head;
		 int position=1;
		 int index=0;
		 boolean flag=false;
		 while(position<=size)
		 {	
			 if(temp.data==key)
			 {
				 index=position;
				 flag=true;
				 break;
			 }
			 else 
			 {
				  position++;
				  temp=temp.next;
			 }
			
		 }
		 if(flag)
		 {
			 return index;
		 }
		 else {
			 return -1;
		 }
	 }
	 public static void reverse(LinkedList list)
	 {
//		 int size=sizeOFll( list);
//		 Node start=list.head;
//		Node temp=list.head;
//		 while(temp!=null)
//		 {
//			 temp=temp.next;
//		 }
//		 Node end=temp;
//		 int mid=size/2;
//		 int position=1;
//		
//		 while(position<=mid)
//		 {
//			  Node temp1=new Node(list.head.data);
//			  start.data=end.data;
//			  end.data=temp.data;
//			  start=start.next;
//			  end=
//		 }
		 Node curr=list.head,next=null,prev=null;
		 while(curr!=null)
		 {
			 next = curr.next;
			 curr.next=prev;
			 prev =curr;
			 curr=next;
			 
		 }
		 list.head=prev;
		
		 

	 }
	 public static void display(LinkedList list)
	 {
		 Node temp=list.head;
		 while(temp!=null)
		 {
			
			 System.out.print(temp.data+"--");
			 temp=temp.next;
		 }
		
	 }
//	 public static void printList(LinkedList list) 
//	    { 
//	        Node currNode = list.head; 
//	    
//	        System.out.print("LinkedList: "); 
//	    
//	        // Traverse through the LinkedList 
//	        while (currNode != null) { 
//	            // Print the data at current node 
//	            System.out.print(currNode.data + " "); 
//	    
//	            // Go to next node 
//	            currNode = currNode.next; 
//	        } 
//	    }
	
	
	 
}
