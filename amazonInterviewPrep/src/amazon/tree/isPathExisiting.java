package tree;

import java.util.Iterator;
import java.util.LinkedList;


public class isPathExisiting {
    private int V;
    private LinkedList<Integer> adj[];

    isPathExisiting(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }

    }
    void addEdge ( int s, int v){
        adj[s].add(v);
    }

    Boolean ifPathExist ( int i, int k){
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[i] = true;
        queue.add(i);

        Iterator<Integer> iter;

        while(queue.size()!=0){
            i = queue.poll();

            int n;
            iter = adj[i].listIterator();

            while(iter.hasNext()){

                n= iter.next();

                if(n== k){
                    return true;
                }

                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }

            }
        }

        return false;
    }

    public static void main(String[] args) {
        isPathExisiting graph = new isPathExisiting(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);


        if(graph.ifPathExist(1,3)){
            System.out.println("true");
        };
    }
}
