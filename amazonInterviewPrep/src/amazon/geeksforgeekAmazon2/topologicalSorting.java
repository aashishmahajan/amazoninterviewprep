package geeksforgeekAmazon2;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class topologicalSorting{
    private int V;
    private LinkedList<Integer> adj[];
    topologicalSorting(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i <v; i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int u, int v){
        adj[u].add(v);
    }

    void findTopSort() {
        Stack stack = new Stack();
        boolean[] isvisited = new boolean[V];
        for(int i =0; i < V; i++){
            isvisited[i] = false;
        }
        for(int i=0; i <V; i++){
            if(!isvisited[i]){
                topoSort(i, isvisited,stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() +" ");
        }
    }

    void topoSort(int i, boolean[] isvisited, Stack stack) {
        isvisited[i] = true;
        Integer vi;
        Iterator<Integer> it = adj[i].iterator();
        while(it.hasNext()){
            vi = it.next();
            if(!isvisited[vi]){
                topoSort(vi, isvisited,stack);
            }
        }
        stack.push(new Integer(i));
    }

    public static void main(String[] args) {
        topologicalSorting g = new topologicalSorting(6);
        g.addEdge(5,2);
        g.addEdge(5,0);
        g.addEdge(4,0);
        g.addEdge(4,1);
        g.addEdge(2,3);
        g.addEdge(3,1);
        g.findTopSort();
    }


}
