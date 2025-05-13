
public class LinkedList 
{
	private Node head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public void addAtFront(String str)
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}
	
	public void addAtEnd(String str)
	{
		Node newNode = new Node(str);
		Node current = head;
		
		if(head == null)
		{
			newNode.setNext(head);
			head = newNode;
		}
		else
		{
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}
	
	public void remove(String str)
	{
		Node current = head;
		Node previous = head;
		
		if(current.getData().equals(str))
		{
			head = current.getNext();
		}
		else
		{
			while(current.getNext() != null)
			{
				previous = current;
				current = current.getNext();
				if(current.getData().equals(str))
				{
					previous.setNext(current.getNext());
				}
			}
		}
	}

}
