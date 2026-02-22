import java.util.*;

public class Main_LStack  
{   

	public static void main(String args[])
	{
		int num, flag, p;
	    LStack LL = new LStack();
		Random rnd = new Random(100);
		for (int i = 0; i <= 4; i++)
		{
			num = rnd.nextInt(101);
			LL.Push(num);
		}

		LL.Print();

		System.out.println("Enter 1 to pop, 2 to push, 3 to exit");
		flag = Integer.parseInt(new Scanner(System.in).nextLine());
		while (flag != 3)
		{
			if (flag == 1)
			{
				p = LL.Pop();
				System.out.printf("the item poped out is: %1s" + "\r\n", p);
				System.out.println("The items in the Stack  after poping are:");
				LL.Print();
			}
			else
			{
				if (flag == 2)
				{
					System.out.println("Enter an integer to push it into the Stack:");
					p = Integer.parseInt(new Scanner(System.in).nextLine());
					LL.Push(p);
					System.out.println("The items in the Stack  after pushing are:");
					LL.Print();

				}
			}
			System.out.println("Enter 1 to pop, 2 to push, 3 to exit");
			flag = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		System.out.println("End of testing. Goodbye!");
	}
}
	



class Node
{
    public int item;
	public Node link;
	public Node(int theItem)
	{
	    item = theItem;
		link = null;
	}
}
class LinkedListClass
{
    public Node header;
	private int top;
	private int size;
	
	public LinkedListClass()
	{
		header = null;
	}
	
    public final void Append(int newItem)
	{
		Node newNode = new Node(newItem);
		newNode.link = header;
		header = newNode;
	}

	public final int Remove()
	{
		Node x = header;
		if (header != null)
		{
			header = header.link;
		}
		return x.item;
	}

	public final void PrintList()
	{
		if (header == null)
		{
			System.out.println("The list is empty!");
		}
		else
		{
			Node current = header;
			System.out.println(current.item);
			while (!(current.link == null))
			{
				current = current.link;
				System.out.println(current.item);
			}
		}
	}
	
}
class LStack
{
    LinkedListClass LL;
    public LStack()
    {
        LL = new LinkedListClass();
    }
    public void Push(int x)
    {
        LL.Append(x);
    }
    public int Pop()
    {
        return LL.Remove();
    }
    public void Print()
    {
        LL.PrintList();
    }
}
	
