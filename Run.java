package graph;

public class Run {

	public static void main(String[] args) {
		int startingVertex = 0;
		int numberOfVertex = 9;		
		Graph g = new Graph(numberOfVertex); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 0);    
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(2, 7);
        g.addEdge(3, 1);
        g.addEdge(3, 2);
        g.addEdge(3, 6);
        g.addEdge(4, 1);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 4);
        g.addEdge(6, 3);
        g.addEdge(6, 4);
        g.addEdge(6, 7);
        g.addEdge(7, 2);
        g.addEdge(7, 6);
        g.addEdge(7, 8);
        g.addEdge(8, 7);
  
        System.out.println("Depth First Traversal Starting from vertex " + startingVertex + ": "); 
  
        g.DFS(startingVertex); 
	}

}
