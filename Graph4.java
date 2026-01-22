/*cheapest flight within k stops
import java.util.*;
public class Graph5 {
    static class Edge {
        int src;
        int dest;
        int wt;     
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) { 
            graph[i] = new ArrayList<>();
        }   
        graph[0].add(new Edge(0,1,100));    
        graph[0].add(new Edge(0,2,500));
        graph[1].add(new Edge(1,2,100));
    }   
    public static int cheapestFlight(ArrayList<Edge> [] graph, int src, int dest, int k) {
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;    
            }
        }
        for(int i=0; i<=k; i++) {   
            int temp[] = dist.clone();
            for(int j=0; j<graph.length; j++) {
                for(int l=0; l<graph[j].size(); l++) {
                    Edge e = graph[j].get(l);
                    if(dist[j] != Integer.MAX_VALUE && dist[j] + e.wt < temp[e.dest]) {
                        temp[e.dest] = dist[j] + e.wt;
                    }
                }
            }
            dist = temp;
        }
        if(dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int v = 3;  
        ArrayList<Edge> graph[] = new ArrayList[v];     
        createGraph(graph); 
        int src = 0;
        int dest = 2;
        int k = 1;
        System.out.println("Cheapest flight from " + src + " to " + dest + " with at most " + k + " stops is " + cheapestFlight(graph, src, dest, k));
    }
}*/

/*connecting cities with minimum cost (MST) - Prims Algorithm
import java.util.*;
public class Graph4 {
    static class Edge {
        int src;
        int dest;
        int wt;   
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) { 
            graph[i] = new ArrayList<>();
        }   
        graph[0].add(new Edge(0,1,10));    
        graph[0].add(new Edge(0,2,15));
        graph[1].add(new Edge(1,3,12));
        graph[1].add(new Edge(1,5,15));
        graph[2].add(new Edge(2,4,10));        
        graph[3].add(new Edge(3,5,2));    
        graph[4].add(new Edge(4,5,5));    
    }   
    public static void primsMST(ArrayList<Edge> [] graph) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>((a,b) -> a.wt - b.wt);
        pq.add(new Edge(0,0,0));
        int finalCost = 0;
        while(!pq.isEmpty()) {
            Edge curr = pq.remove();
            if(!vis[curr.dest]) {
                vis[curr.dest] = true;
                finalCost += curr.wt;
                for(int i=0; i<graph[curr.dest].size(); i++) {
                    Edge e = graph[curr.dest].get(i);
                    if(!vis[e.dest]) {
                        pq.add(e);
                    }
                }
            }
        }
        System.out.println("Minimum cost to connect all cities is " + finalCost);
    }
    public static void main(String[] args) {
        int v = 6;  
        ArrayList<Edge> graph[] = new ArrayList[v];     
        createGraph(graph); 
        primsMST(graph);
    }   
}*/

//disjoint set
import java.util.*;
public class Graph4 {
    static class Edge {
        int src;
        int dest;   
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {  
        for(int i=0; i<graph.length; i++) { 
            graph[i] = new ArrayList<>();
        }   
        graph[0].add(new Edge(0,1));    
        graph[0].add(new Edge(0,2));    
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,3));        
        graph[3].add(new Edge(3,4));    
        graph[4].add(new Edge(4,5));    
        graph[5].add(new Edge(5,3));    
    }   
    public static int findParent(int v, int parent[]) {
        if(v == parent[v]) {
            return v;
        }
        return parent[v] = findParent(parent[v], parent);
    }
    public static void union(int v1, int v2, int parent[], int rank[]) {
        int p1 = findParent(v1, parent);
        int p2 = findParent(v2, parent);
        if(rank[p1] < rank[p2]) {
            parent[p1] = p2;
        } else if(rank[p1] > rank[p2]) {
            parent[p2] = p1;
        } else {
            parent[p2] = p1;
            rank[p1]++;
        }
    }
    public static void main(String[] args) {
        int v = 6;  
        ArrayList<Edge> graph[] = new ArrayList[v];     
        createGraph(graph); 
        int parent[] = new int[v];      
        int rank[] = new int[v];      
        for(int i=0; i<v; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        //union
        union(0,1, parent, rank);
        union(1,2, parent, rank);
        union(3,4, parent, rank);
        union(4,5, parent, rank);
        //find
        System.out.println("Parent of 2 is: " + findParent(2, parent));
        System.out.println("Parent of 5 is: " + findParent(5, parent));
    }
}
