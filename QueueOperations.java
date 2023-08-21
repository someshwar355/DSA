package TaskDSA;

import java.util.ArrayList;
import java.util.Scanner;

class Queue 
{
    private ArrayList<Integer> a;

    public Queue() 
    {
        a = new ArrayList<>();
    }

    public void addElementsInQuene(int element) 
    {
        a.add(element);
        System.out.println("Element added in the Quene");
    }

    public void dequeueElementsInQuene() 
    {
        if (!a.isEmpty()) 
        {
            int removedElement =a.remove(0);
            System.out.println("Removed element from the queue" + removedElement);
        } else {
            System.out.println("Queue is empty. Cannot remove.");
        }
    }

    public void display() 
    {
        if (!a.isEmpty()) 
        {
            System.out.print("Queue elements: ");
            for (int element : a)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        else 
        {
            System.out.println("Queue is empty.");
        }
    }
    
}

public class QueueOperations 
{
   public void perfromOperationsQuene()
   {
        Queue q = new Queue();
        Scanner xyz = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1: Add Element to Queue");
            System.out.println("2: Delete Element from Queue");
            System.out.println("3: Display Queue");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            choice = xyz.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element to add");
                    int elementToAdd =xyz.nextInt();
                   q.addElementsInQuene(elementToAdd);
                    break;
                case 2:
                    q.dequeueElementsInQuene();
                    break;
                case 3:
                   q.display();
                    break;
                case 4:
                	SwitchProgram s1=new SwitchProgram();
    				s1.menuPerform();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (true);

}


}
