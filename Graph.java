package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private int V;
	private LinkedList<Integer> adjacent[];
	
	public Graph(int v) {
		V = v;
		adjacent = new LinkedList[v];
		for (int i = 0; i<v; i++) {
			adjacent[i] = new LinkedList();
		}

	}

	void addEdge(int v, int w) {
		adjacent[v].add(w);
	
	}

	public void DFS(int v) {
		// Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
  
        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited); 
		
	}
	
	void DFSUtil(int v,boolean visited[]) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i = adjacent[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited); 
        } 
    }
	

	
	
}
