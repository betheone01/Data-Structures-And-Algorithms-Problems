package assignment4;

import java.util.Scanner;

//Write a program to perform the following operations using Java.
//1. Read the count of elements from user to create the circular queue using array.
//2. Create the class and methods for the following and call them using a menu based program and
//call them using a loop.
//a. Show the contents of circular queue
//b. Enqueue the data in the circular queue
//c. Access the data from the circular queue
//d. Check how many elements are there in the circular queue.
//e. Check to see if the circular queue is full?
//f. Check to see if circular queue is empty.
public class CircularQueue {
	Scanner sc=new Scanner (System.in);
	private int front,rear;
	private int size,queue[];
	public CircularQueue( int size ) {
		super();
		this.front = -1;
		this.rear = -1;
		this.size = size;
		this.queue = new int[size];
		
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(front ==0 && rear ==size-1)
		{
			return true;
		}
		if(front ==rear+1)
		{
			return true;
		}
		return false;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public void input()
	{
		for(int i=0;i<size;i++)
		{
			enqueue(sc.nextInt());
		}
	}
	public void enqueue(int element)
	{
		if(isFull())
		{
			System.out.println("Queue is full ");
		}
		else
		{
			if(front==-1)   //queue is empty 
			{
				front =0;
				rear =front;
				queue[rear]=element;
				System.out.println("successfully added element "+element);
			}
			else {
				rear++;
				queue[rear]=element;
				System.out.println("successfully added element "+element);
			}
		}

	
	}
	public int dequeue()
	{	int element=-1;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else {
			element=queue[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else {
				front = (front + 1) % size;
			}
		}
		return (element);
	}
	void display() {
	    /* Function to display status of Circular Queue */
	    int i;
	    if (isEmpty()) {
	      System.out.println("Empty Queue");
	    } else {
	      System.out.println("Front -> " + front);
	      System.out.println("Items -> ");
	      
	      for (i = front; i != rear; i = (i + 1) % size)
	        System.out.print(queue[i] + " ");
	      
	      System.out.println(queue[i]);
	      System.out.println("Rear -> " + rear);
	    }
	  }
	 int NoOfEle()
	{
		int count=1;
		for(int i=front;i != rear; i = (i + 1) % size)
		{
			if(queue[i]!=0 || queue[i]!=-1)
			{
				count++;
			}
			
		}
		return count;
	}
}
