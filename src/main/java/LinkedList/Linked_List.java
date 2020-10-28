package LinkedList;
public class Linked_List
{
	Node head;
	//insert operation
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