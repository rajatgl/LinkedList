package LinkedList;
public class Linked_List
{
	Node head;
	//insert operations
	public void append(int...data)
	{
		for (int datum : data)
		{
			Node node = new Node();
			node.data = datum;
			node.next = null;
			if(head==null)
			{
				head = node;
			}
			else
			{
				Node n = head;
				while(n.next!=null)
				{
					n = n.next;
				}
				n.next = node;
			}
		}
	}
	
	public void add(int...data)
	{
		for(int datum : data)
		{
			Node node = new Node();
			node.data = datum;
			node.next = head;
			head = node;
		}
	}
	
	public void insert(int datum, int position) 
	{
		Node node = new Node();
		node.data = datum;
		node.next = null;
		Node n = head;
		if(position==0)
			add(datum);
		else
		{
			for(int i=0; i<position-1; i++)
			{
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	//to print the list
	public void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.println(node.data);
	}
}