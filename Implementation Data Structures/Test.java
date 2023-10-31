package assignment4;

import java.util.Scanner;

import assignment1.array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Plases enter the size of array ");
		CircularQueue a=new CircularQueue(sc.nextInt());
		
		boolean flag =true;
		while(flag)
			
		{
			System.out.println(
					"	a. Show the contents of circular queue\r\n"
					+ "b. Enqueue the data in the circular queue\r\n"
					+ "c. Access the data from the circular queue\r\n"
					+ "d. Check how many elements are there in the circular queue.\r\n"
					+ "e. Check to see if the circular queue is full?\r\n"
					+ "f. Check to see if circular queue is empty."
					);
			
			System.out.println("Enter the choice ");
			
			
			switch(sc.nextInt())
			{
			case 1:
				a.display();
				break;
			case 2:
			  System.out.println("enter the element to enter in cir queue");
				a.enqueue(sc.nextInt());
				break;
			case 3:
			System.out.println(	a.dequeue());					
				break;
			case 4:
				int count=a.NoOfEle();
			 System.out.println(count);
			 break;
				
			case 5:
			  System.out.println( a.isFull());
			  if(a.isFull())
			  {
				  System.out.println("full");
			  }
			  else {
				  System.out.println("Not full");
			  }
				break;
			case 6:
				if(a.isEmpty())
				  {
					  System.out.println("Empty");
				  }
				  else {
					  System.out.println("Not Empty ");
				  }
				break;
			case 9:
				flag=false;
				break;
			}
		}
		
	}

}
