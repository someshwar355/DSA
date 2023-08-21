
package TaskDSA;

import java.util.Scanner;
public class SwitchProgram {
void menuPerform()
{
	Scanner xyz=new Scanner(System.in);
	int size1;
	  
	do {
		System.out.println("***MENU BAR OF DSA OPERATIONS PERFORMOS***");
	System.out.println("1:Opeation on Stack");
	System.out.println("2:Opeation on Array");
	System.out.println("3:Opeation on Quene");
	System.out.println("4:Opeation on Singly LinkedList");
	System.out.println("5:Opeation on doubly LinkedList");
	System.out.println("6:Opeation on BInary Search Tree");
	System.out.println("7:Opeation on Graph\n");
	System.out.println("Enter the Choices");
	int ch=xyz.nextInt();
      switch(ch)
      {
      case 1:
    	  DynamicStackExample s=new DynamicStackExample();
    	   s.operationsStack();
    	  break;
      case 2:
    	  ArrayImplemtation aa=new ArrayImplemtation();
    	  aa.arrayOperationsImp();
    	  break;
      case 3:
    	
    	  QueueOperations q1=new  QueueOperations ();
    	q1.perfromOperationsQuene();
    	  break;
      case 4:
    	 // LinkedListImplementations  link=new LinkedListImplementations ();
    	  LinkedListImplementations link=new LinkedListImplementations();
    	  link.linkedListOperations();
    	  break;
      case 5:
    	  doublyLinkList d=new doublyLinkList ();
    	  d.Operation();
    	  break;
      case 6:
    	  BST b=new  BST();
    	  b.showBinarySearchTree();
    	  break;
      case 7:
    	  Graph g=new  Graph (ch);
    	  g.graphOperations();
    	  break;
    	 default:
    		 System.out.println("Wrong Choies.....");
      }
	
	}while(true);
}
	public static void main(String[] args)
	{
		SwitchProgram s2=new SwitchProgram();
		s2.menuPerform();
		
		
	}
	
}
