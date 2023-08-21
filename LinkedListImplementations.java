package TaskDSA;
import java.util.Scanner;
class Node 
{
    int data;
    Node next;

    public Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList 
{
    Node head;

    public LinkedList()
    {
        this.head = null;
    }
  // insert fronend
    public void insert(int data)
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            Node current = head;
            while (current.next != null) 
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    //add of elemts linkedlist end of
    void endOfAddElement(int newdata)
    {
        Node new_node = new Node(newdata);
 
        if (head == null) {
            head = new_node;
            return;
        }
 
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
 
        last.next = new_node;
    }
 

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    //delete method is used for enter node and delete node
    public void delete(int value) 
    {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != value) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Element not found in the list.");
            return;
        }

        prev.next = current.next;
    }
}

public class LinkedListImplementations 
{
	Scanner xyz=new Scanner(System.in);
	LinkedList list=new LinkedList();
	
	int ele;
	
	// method of Linkedlist operations
	public void linkedListOperations()
	{
		do
		{
			 System.out.println("***Menu Bar LinkedList***");
			System.out.println("1:Insert Value LinkedList ");
			System.out.println("2:Insert Value LinkedList end");
			System.out.println("3:Delete Value LinkedList");
			System.out.println("4:Disply LinkedList");
			System.out.println("5:Exit");
			
			System.out.println("Enter the choices");
			int ch=xyz.nextInt();
			switch(ch)
			{
			case 1:
				// linkedlist value add in Linkedlist
				//LinkedList lll=new LinkedList();
				//lll.display();
				
				
			        
			            System.out.print("Enter element of the Linkedlist\n");
			             ele = xyz.nextInt();
			            list.insert(ele);
			            
			        
				break;
			case 2:
				System.out.println("Enter the elemts add of End..");
				int end=xyz.nextInt();
				list.endOfAddElement(end);
				break;
			case 3:
				System.out.println("Enter the we want to delete node");
				int del=xyz.nextInt();
				   list.delete(del);
				
				break;
			case 4:
		           list.display();
				break;
			case 5:
				SwitchProgram s1=new SwitchProgram();
				s1.menuPerform();
				break;
				default:
					System.out.println("Wrong choices..");
			}
			
		}while(true);
	}

}

