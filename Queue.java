import java.util.Scanner;

public class Queue {

	static Scanner scn = new Scanner(System.in);
	static int  n, front = -1, rear = -1, item;
	static int[] Ar = new int[10];
	
	Queue() {
		
	}
	
	Queue(int n){
		int ch;
		do
		  {
			System.out.printf("\n----Operations----\n\n1.Enqueue\n2.Dequeue\n3.Exit\n");
			System.out.printf("Enter the operation:");
			ch=scn.nextInt();
		    switch (ch)
		    {
		    case 1:
		      enqueue(n);
		      break;
		    case 2:
		      dequeue();
		      break;
		    default:
		      break;
		    }
		  } while (ch < 3);
	}
		
	public static void main(String[] args) {
		Scanner scn1 = new Scanner(System.in);
		int n;
		
		System.out.printf("Enter the size of Queue:");
		n=scn1.nextInt();
		
		new Queue(n);
		  
	}
	
	//To Insert Element To Queue
	public static void enqueue(int n)
	{
	  if (rear >= n - 1)
	  {
	    System.out.println("\n---Overflow!!!---\n\n");
	  }
	  else
	  {
	    if (front == -1 && rear == -1)
	    {
	      front++;
	    }
	    System.out.println("Enter the element to be inserted:");
	    item= scn.nextInt();
	    rear++;
	    Ar[rear] = item;
	  }
	  display(rear);
	}
	
	//To Delete Element In Queue
	public static void dequeue ()
	{
	  if (front == -1)
	  {
		  System.out.println("\nError! Underflow\n\n");
	  }
	  else
	  {
	    item = Ar[front];
	    System.out.printf("The element deleted is %d\n", item);
	    if (front == rear)
	    {
	      front = -1;
	      rear = -1;
	      System.out.printf("\nError! Queue is empty\n\n");
	    }
	    else
	    {
	      front++;
	      display(rear);
	    }
	  }
	}
	
	//To Display Elements In Queue
	public static void display(int rear)
	{
	  int i;
	  System.out.printf("\nThe current Queue is\n");
	  for (i = front; i <= rear; i++)
	  {
		  System.out.printf("%d ", Ar[i]);
	  }
	  System.out.printf("\n");
	}
	
	
}