

import java.util.Scanner;



public class Tester {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc =new Scanner (System.in);
		LinkedList list=new LinkedList();
		boolean flag=true;
		
		
		while(flag)
			
		{	
			System.out.println(""
				+ "1 . Show the contents of linked list\r\n"
				+ "2. Insert the data in the linked list\r\n"
				+ "3. Insert at the head .\r\n"
				+ "4. Insert at mid \n"
				+ "5. Insert at end \n"
				+ "6. Search an element\n"
				+ "7. Reverse the linked list\n"
				+ "8. Exit ");
			System.out.println("Enter the choice");
			switch(sc.nextInt())
			{
			case 1:
				LinkedList.display(list);
				break;
			case 2:
				System.out.println("Enter the data to insert in LL ");
				LinkedList.insert(list, sc.nextInt());
				break;
			case 3:
				System.out.println("Enter the data to insert at head of  LL ");
				list.InsertAtHead(list, sc.nextInt());
				break;
			case 4:
				System.out.println("Enter the data to insert at head of  LL ");
				list.InsertAtMid(list, sc.nextInt());
				break;
			case 5:
				System.out.println("Enter the data to insert at head of  LL ");
				list.InsertAtEnd(list, sc.nextInt());
				break;
				
			case 6:
				System.out.println("Enter the element want to Search");
				System.out.println(list.serach(list, sc.nextInt()));
				break;
				
			case 7:
				list.reverse(list);
				
				break;
			case 8:
				flag=false;
				break;
			}
		}
		
		
		
		
	}
	

}
