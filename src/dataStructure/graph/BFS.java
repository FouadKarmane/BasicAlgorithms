package dataStructure.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    int V; // Number
    LinkedList<Integer> adj[];

    public BFS(int n){
        V=n;
        adj = new LinkedList[V];
        for (int i=0;i<n; i++){
            adj[i]= new LinkedList<>();
        }
    }

    void addEdge(int i, int j){
        adj[i].add(j);
    }

    void BFS(int s){
        //Mark all nodes as not visited
        boolean visited[] = new boolean[V];
        //Create a queue
        LinkedList<Integer> queue= new LinkedList<>();
        //Enqueue and visit the source node
        visited[s]=true;
        queue.add(s);

        while(queue.size()!=0){
            //Dequeue
            s = queue.poll();
            //Process
            System.out.print(s+" ");
            //Enqueue adjacent, unvisited nodes
            Iterator<Integer> adjIter = adj[s].listIterator();
            while (adjIter.hasNext()){
                int adj = adjIter.next();
                if(!visited[adj]){
                    visited[adj]=true;
                    queue.add(adj);
                }
            }
        }
    }

    void DFS(int s){
        //Mark all nodes as not visited
        boolean visit[] = new boolean[V];
        DFS(s,visit);
    }

    void DFS(int s, boolean visited[]){
        visited[s]=true;

    }

    public static void main(String args[])
    {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }

}
