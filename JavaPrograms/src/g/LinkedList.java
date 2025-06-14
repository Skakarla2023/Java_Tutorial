package g;

public class LinkedList 
{
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	// add-first,last
	public void addfirst(String data)
	{
		Node newNode=new Node(data);
		if(
				
				head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	
	
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.addfirst("a");
	}
}
