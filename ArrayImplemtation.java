package TaskDSA;

import java.util.Scanner;

public class ArrayImplemtation
{
	
	Scanner xyz=new Scanner(System.in);
	public void arrayOperationsImp()
	{ int size1,i;
	
	System.out.println("Enter the Size of Array");
		size1=xyz.nextInt();
		int a2[]=new int[size1];
		System.out.println("Enter the Array Values");
		for(i=0;i<a2.length-1;i++)
		{
			a2[i]=xyz.nextInt();
		}
		do {
			  
		System.out.println("1:Insert value in Array");
		System.out.println("2:Delete th value");
		System.out.println("3:Search Value In Array");
		System.out.println("4:Sort Ascending order ");
		System.out.println("5:Sort Descnding Order");
		System.out.println("6:Reverse Of Array");
		System.out.println("7:Exit");
		
		System.out.println("Enter the choices");
		int ch1=xyz.nextInt();
		
  		
		switch(ch1)
		{
		case 1:
			
			
	  		// try catch used from detect the  exceptions
	  		try {
	  			
			//insert value in array speific index Array
			System.out.println("Enter the Index");
			int ind=xyz.nextInt();
			System.out.println("Enter the Value");
			int val=xyz.nextInt();
			for(i=4;i>=ind;i--)
			{
				a2[i+1]=a2[i];
			}
			a2[ind]=val;
			System.out.println("Disply the Array Before inserting val in index");
			for(i=0;i<a2.length;i++)
			{
				System.out.printf("[%d]---->%d\n",i,a2[i]);
			}
	  		}
	  		catch(Exception ex)
	  		{
	  			System.out.println("Errror"+ex);
	  		}
			break;
		case 2:
			try {
				
			System.out.println("Enter the Delete index value in Array");
			int index=xyz.nextInt();
			 System.out.println("Disply the Array Before Delete Index Value");
				for(i=0;i<a2.length;i++)
				{
					System.out.printf("%d\n",a2[i]);
				}
			//logic delete index value
				for ( i =index; i < a2.length - 1; i++) 
				{
					  a2[i] = a2[i + 1];
		        }
		        
				 a2[a2.length - 1] = 0;
		    System.out.println("After delete the index value Of Array");
		    for(i=0;i<a2.length-1;i++)
		    {
		    	System.out.printf("%d\n",a2[i]);
		    }
			}
			catch(Exception ex)
			{
				System.out.println("Error"+ex);
			}
			break;
		case 3:
			// Serach implemenations
			System.out.println("Serach Value in Array");
			int search=xyz.nextInt();
			boolean flag=false;
			for(i=0;i<a2.length;i++)
			{
				if(a2[i]==search)
				{
				 	flag=true;
					break;
				}
			}
				if(flag)
				{
					System.out.println("value is Serach Successfully=\t"+search);
				}
				else
				{
					System.out.println("value is not found=\t"+search);
				}
			
			break;
		case 4:
			
			 //implementations Bubble sort 
			   for(i=0;i<a2.length;i++)
			   {
				   for(int j=(i+1);j<a2.length;j++)
				   {
					 if(a2[i]>a2[j])
					 {
						 int temp=a2[i];
						 a2[i]=a2[j];
						 a2[j]=temp;
					 }
				   }
			   }
			   System.out.println("Disply the Array Values After Asending");
				for(i=0;i<a2.length;i++)
				{
					
					System.out.println(""+a2[i]);
				}
				
			break;
		case 5:
			
			 //implementations Bubble sort Descnding Value
			   for( i=0;i<a2.length;i++)
			   {
				   for(int j=(i+1);j<a2.length;j++)
				   {
					 if(a2[i]<a2[j])
					 {
						 int temp=a2[i];
						 a2[i]=a2[j];
						 a2[j]=temp;
					 }
				   }
			   }
			   System.out.println("Disply the Array Values Desnding Order");
				for( i=0;i<a2.length;i++)
				{
					System.out.println(""+a2[i]);
				}
				
			break;
		case 6:
			// reverse the array using DSA
			
			int len,m,e,s;
			len=a2.length;
			m=len/2;
			e=len-1;
			for(s=0;s<m;s++)
			{
				int temp=a2[s];
				a2[s]=a2[e];
				a2[e]=temp;
				e--;
				
			}
			System.out.println("Disply the Array Values After Reverse");
			for(i=0;i<a2.length;i++)
			{
				System.out.println(a2[i]);
			}
			
			break;
		case 7:
			SwitchProgram s1=new SwitchProgram();
			s1.menuPerform();
			break;
			default:
			 System.out.println("Wrong choes......");
		
		}
	     	
	}while(true);
	}
}
