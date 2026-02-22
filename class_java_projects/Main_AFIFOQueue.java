import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		final int SIZE = 10;
		int num, flag, p;
		AFIFOQueue arrFIFOQue = new AFIFOQueue(SIZE);
		Random rnd = new Random(100);
		for (int i = 0; i < 8; i++)
		{

			num = rnd.nextInt(100);
			arrFIFOQue.Enqueue(num);
		}
		arrFIFOQue.Print();

		System.out.println("Enter 1 to dequeue, 2 to enqueue, 3 to exit");
		flag = Integer.parseInt(new Scanner(System.in).nextLine());
		while (flag != 3)
		{
			if (flag == 1)
			{
				p = arrFIFOQue.Dequeue();
				System.out.printf("The dequeued item is: %1s" + "\r\n", p);
				System.out.println("The items in the queue after dequeue are:");
				arrFIFOQue.Print();
				System.out.printf("The front and rear are: %1s, %2s" + "\r\n", arrFIFOQue.front, arrFIFOQue.rear);
			}
			if (flag == 2)
			{
				System.out.println("Enqueue an integer:");
				p = Integer.parseInt(new Scanner(System.in).nextLine());
				arrFIFOQue.Enqueue(p);
				System.out.println("The items in the queue after enqueue are:");
				arrFIFOQue.Print();
				System.out.printf("The front and rear are: %1s, %2s" + "\r\n", arrFIFOQue.front, arrFIFOQue.rear);
			}
			System.out.println("Enter 1 to dequeue, 2 to enqueue, 3 to exit");
			flag = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		System.out.println("Goodbye!\n");
	}
	
}
class AFIFOQueue
{
	public int[] arr;       
	public int front, rear;
	public int size;

	public AFIFOQueue(int Size)   
	{
		arr = new int[Size]; 
		size = Size;
		front = -1;
		rear = -1;
	}


	public final boolean Empty()
	{
		if (rear == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public final boolean Full()
	{
		if (rear == front - 1 || front == 0 && rear == size - 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public final void Enqueue(int x)
	{
		if (!Full())  
		{
			if (rear == -1) //empty queue
			{
				front = 0;
				rear = 0;
			}
			else
			{
				if (rear != size - 1) 
				{
					rear = rear + 1;
				}
				else
				{
					rear = 0; 
				}
			}
			arr[rear] = x;
		}
		else
		{
			System.out.println("The queue is full!");
		}
	}

	public final int Dequeue()
	{
		if (!Empty())  
		{
			int x = arr[front];
			if (front != rear) 
			{
				if (front != size - 1) 
				{
					front = front + 1;
				}
				else 
				{
					front = 0;
				}
			}
			else 
			{
				front = -1; 
				rear = -1;
			}
			return x;
		}
		else
		{
			System.out.println("The queue is empty!");
			return -1;
		}
	}


	public final void Print()
	{
		if (Empty())
		{
			System.out.println("The queue is empty!");
		}
		else
		{
			if (rear >= front)
			{
				for (int i = front; i <= rear; i++)
				{
					if (i == front)
					{
						System.out.printf("%1$s(front) ", arr[i]);
					}
					else if (i == rear)
					{
						System.out.printf("%1$s(rear) ", arr[i]);
					}
					else
					{
						System.out.print(arr[i] + " ");
					}
				}
				System.out.println();
			}
			else //circular
			{
				for (int i = 0; i <= rear; i++)
				{
					if (i == rear)
					{
						System.out.printf("%1$s(rear) ", arr[i]);
					}
					else
					{
						System.out.print(arr[i] + " ");
					}
				}
				for (int i = front; i <= size - 1; i++)
				{
					if (i == front)
					{
						System.out.printf("%1$s(front) ", arr[i]);
					}
					else
					{
						System.out.print(arr[i] + " ");
					}
				}

				System.out.println();
			}
		}
	}
}
