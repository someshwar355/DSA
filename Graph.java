package TaskDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Graph 
{
	Scanner xyz=new Scanner(System.in);
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int numVertices) 
    {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) 
        {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) 
    {
        if (source < numVertices && destination < numVertices) 
        {
            adjacencyList.get(source).add(destination);
        }
    }

    public void dfs(int startVertex) 
    {
        boolean[] visited = new boolean[numVertices];
        dfsRecursive(startVertex, visited);
    }

    private void dfsRecursive(int vertex, boolean[] visited) 
    {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        List<Integer> neighbors = adjacencyList.get(vertex);
        for (int neighbor : neighbors) 
        {
            if (!visited[neighbor]) 
            {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    
	//this method used from graph
	public void graphOperations()
	
	{
		do
		{
			System.out.println();
			System.out.println("1:DFS");
			System.out.println("2:BFS");
		  System.out.println("Enter the Choice");
		  int ch=xyz.nextInt();
		  switch(ch)
		  {
		  case 1:
			  System.out.println("Enter the number of vertices");
		        int numVertices =xyz.nextInt();
		        Graph graph = new Graph(numVertices);

		        System.out.println("Enter the number of edges");
		        int numEdges =xyz.nextInt();
		        for (int i = 0; i < numEdges; i++) {
		            System.out.println("Enter edge  start destinations");
		            int source =xyz.nextInt();
		            int destination =xyz.nextInt();
		            graph.addEdge(source, destination);
		        }
		        System.out.println("Enter the starting vertex for DFS traversal");
		        int startVertex =xyz.nextInt();

		        System.out.println("DFS Traversal starting from vertex --->" + startVertex);
		        graph.dfs(startVertex);
			break;
		  case 2:
			  break;
			  default:
				  System.out.println("Wrong choices");
		  }
			
		}while(true);
	}
}
