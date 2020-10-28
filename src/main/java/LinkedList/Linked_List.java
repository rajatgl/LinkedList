package LinkedList;
public class Linked_List
{
	Node head;
	//insert operation
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
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