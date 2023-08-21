package TaskDSA;

import java.util.Scanner;

public class DynamicStackExample
{
      int size = 1000; // Maximum size of the stack
     int a[] ;
     int top;

    public DynamicStackExample()  //this constcutor
    {
        a= new int[size];
        top = -1;
    }

    public void pushElemetsInStack(int value) 
    {
        if (top < size - 1) 
        {
            a[++top] = value;
            System.out.println("Value pushed in the stack.");
        } else {
            System.out.println("Stack is full. Cannot push.");
        }
    }

    public void popElemetInStack() {
        if (top >= 0) {
            int poppedValue =a[top--];
            System.out.println("Popped value: " + poppedValue);
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    public void deleteSpeficElemtsInStack(int value) {
        int index = -1;
        for (int i = 0; i <= top; i++) {
            if (a[i] == value) {
                index = i;
                break;
            }
        }
        if (index != -1) 
        {
            for (int i = index; i < top; i++) 
            {
                a[i] = a[i + 1];
            }
            top--;
            System.out.println("Value " + value + " deleted from the stack.");
        }
        else 
        {
            System.out.println("Value " + value + " not found in the stack.");
        }
    }

    public void display() 
    {
        System.out.println("Stack Elements");
        for (int i = 0; i <= top; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public void operationsStack(){
        DynamicStackExample s = new DynamicStackExample();
        Scanner xyz = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1: Push Operation");
            System.out.println("2: Pop Operation");
            System.out.println("3: Delete Value in Stack");
            System.out.println("4: Display the Stack");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            choice = xyz.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value of Push ");
                    int value =xyz.nextInt();
                     s.pushElemetsInStack(value);
                    break;

                case 2:
                    s.popElemetInStack();
                    break;

                case 3:
                		 System.out.println("Enter the value to delete");
                         int deleteValue =xyz.nextInt();
                         s.deleteSpeficElemtsInStack(deleteValue);	
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                	SwitchProgram s1=new SwitchProgram();
    				s1.menuPerform();
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (true);

        
    }
}
