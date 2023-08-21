package TaskDSA;

import java.util.Scanner;

class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) 
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BST
{
	Scanner xyz=new Scanner(System.in);
	
    private TreeNode root;
    public BST()  //constuctor
    {
        root = null;
    }

    public void insert(int val)
    {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) 
    {
        if (root == null) 
        {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) //check condtions value is less root left
        {
            root.left = insertRec(root.left, val);
        } 
        else if (val > root.val) //val is grather of root right side
        {
            root.right = insertRec(root.right, val);
        }

        return root;
    }
    
  //disply the inorder
    public void displayInOrder() 
    {
        displayInOrderRec(root);
    }

    public void displayInOrderRec(TreeNode root) 
    {
        if (root != null) 
        {
            displayInOrderRec(root.left);
            System.out.print(" "+root.val);
            System.out.println();
            displayInOrderRec(root.right);
        }
       
    }
    //preorder 
    public void displayPreorder() 
    {
        displayPreorderrec(root);
    }

    
    private void displayPreorderrec(TreeNode root2) {
    	if (root != null) 
        {
    		
    		 System.out.print(" "+root.val);
            displayInOrderRec(root.left);
            displayInOrderRec(root.right);
        }
		
	}

	//postorder
    public void displayPostOrder() 
    {
        displayPostOderVal(root);
    }

    public void displayPostOderVal(TreeNode root2) 
    {
    	if (root != null) 
        {
            displayInOrderRec(root.left);
            displayInOrderRec(root.right);
            System.out.print(" "+root.val);
            System.out.println();
           
        }
		
	}
    
    //delete of the bst value
    public void delete(int val) 
    {
        root = deleteRec(root, val);
    }

    private TreeNode deleteRec(TreeNode root, int val) 
    {
        if (root == null) 
        {
            return root;
        }

        if (val < root.val) 
        {
            root.left = deleteRec(root.left, val);
        } else if (val > root.val)
        {
            root.right = deleteRec(root.right, val);
        } else
        {
            if (root.left == null) 
            {
                return root.right;
            } 
            else if (root.right == null) 
            {
                return root.left;
            }
            root.right = deleteRec(root.right, root.val);
        }

        return root;
    }


    //this is method of BST Operations
    public void showBinarySearchTree()
	{    BST b=new BST();
		do 
		{
			
			System.out.println("1:insert in BST");
			System.out.println("2:Inorder in BST");
			System.out.println("3:Preorder in BST");
			System.out.println("4:Postorder in BST");
			System.out.println("5:delete in BST");
			System.out.println("6:Exit");
			System.out.println("Enter the choice");
			int ch=xyz.nextInt();
			switch(ch)
			{
			//insert value in BST
			case 1:
			System.out.println("Insert value in BST");
			int val=xyz.nextInt();
			b.insert(val);
			break;
			case 2:
				b.displayInOrder();
			break;
			case 3:
				b.displayPreorder();
				break;
			case 4:
				b.displayPostOrder();
				break;
			case 5:
				System.out.println("Enter the delete key");
				int del=xyz.nextInt();
				b.delete(del);
				break;
			case 6:
				SwitchProgram s1=new SwitchProgram();
				s1.menuPerform();
				break;
		
				default:
					System.out.println("Wrong choice");
			}
			
		}while(true);
	
	}
   
}


