package TaskDSA;
import java.util.Scanner;

public class doublyLinkList 
{
	Scanner sc = new Scanner(System.in);

	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	class DoublyLinkedList {
		Node head;

		public DoublyLinkedList() {
			this.head = null;
		}

		 void insertAtBeginning(int data) {
		        Node newNode = new Node(data);
		        if (head == null) {
		            head = newNode;
		        } else {
		            newNode.next = head;
		            head.prev = newNode;
		            head = newNode;
		        }
		    }
		 
		 void insertAtEnd(int data) {
		        Node newNode = new Node(data);
		        if (head == null) {
		            head = newNode;
		        } else {
		            Node current = head;
		            while (current.next != null) {
		                current = current.next;
		            }
		            current.next = newNode;
		            newNode.prev = current;
		        }
		    }
		
		void insert(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
			} else {
				Node current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = newNode;
				newNode.prev = current;
			}
		}

		public void Display() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
		
		void delete(int data) {
	        Node current = head;
	        while (current != null) {
	            if (current.data == data) {
	                if (current.prev != null) {
	                    current.prev.next = current.next;
	                } else {
	                    head = current.next;
	                }

	                if (current.next != null) {
	                    current.next.prev = current.prev;
	                }
	                return;
	            }
	            current = current.next;
	        }
		}
		
	}

	public void Operation() {
		DoublyLinkedList dl = new DoublyLinkedList();
		
		do {
			System.out.println("enter the your choice");
			System.out.println("case 1:insert the element");
			System.out.println("case 2:Insert At Begining");
			System.out.println("case 3:Insert at end");
			System.out.println("case 4:Delete");
			System.out.println("case 5:Display");
			System.out.println("case 6:Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {   
				System.out.println("enter the data");
				int value = sc.nextInt();
				dl.insert(value);
			}
				break;   
			case 2: {
				System.out.println("enter the value At add Beginning");
				int value=sc.nextInt();
				dl.insertAtBeginning(value);
			}
				break;
			case 3: {
				System.out.println("enter the value add of end");
				int value=sc.nextInt();
				dl.insertAtEnd(value);
			}
				break;
			case 4: {
				System.out.println("enter the element and delete");
				int value=sc.nextInt();
				dl.delete(value);
			}
				break;
			case 5: {
				dl.Display();
			}
				break;
			case 6: {
				SwitchProgram s1=new SwitchProgram();
				s1.menuPerform();
				
			}
				break;
			default: {
				System.out.println("Invalid input.....!");
			}
			}
		} while (true);
	}

	

}