package geeksforgeekAmazon2;

import java.util.*;

public class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v){
        V =v;
        adj = new LinkedList[V];
        for(int i =0; i < v; i ++){
            adj[i]= new LinkedList<>();
        }
    }

    void addEdge(int u, int v){
        adj[u].add(v);
    }

    void topSort(){
        Stack<Integer> stack = new Stack();
        boolean[] isvisited = new boolean[V];
        for(int i =0; i < V; i++){
            if(!isvisited[i]){
                topSortUtil(stack, isvisited, i);
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private void topSortUtil(Stack stack, boolean[] isvisited, int i) {
        isvisited[i]= true;
        Integer v;
        Iterator<Integer> it= adj[i].iterator() ;
        while(it.hasNext()){
            v = it.next();
            if(!isvisited[v]){
                topSortUtil(stack, isvisited,v);
            }
        }
        stack.push(new Integer(i));
    }

    public static void main(String[] args) {
        /*Graph g = new Graph(6);
        g.addEdge(5,2);
        g.addEdge(5,0);
        g.addEdge(4,0);
        g.addEdge(4,1);
        g.addEdge(2,3);
        g.addEdge(3,1);
        g.topSort();
*/

        Graph g2 = new Graph(4);
        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(1, 2);
        g2.addEdge(2, 0);
        g2.addEdge(2, 3);
        g2.addEdge(3, 3);

        System.out.println(g2.detectCycle());

    }

    private boolean detectCycle() {
        boolean hasCycle;
        boolean isVisited[] = new boolean[V];
        Set<Integer> set = new HashSet<>();
        for(int i =0; i < V; i++){
            if(visitCheck(isVisited,i,set)){
                return true;
            }
        }
        return false;
    }

    private boolean visitCheck(boolean[] isVisited, int i, Set set) {
        if(!isVisited[i]){
            isVisited[i]=true;
            set.add(i);
            int v ;
            Iterator<Integer> it = adj[i].iterator();
            while(it.hasNext()){
                v = it.next();
                if(!isVisited[v]){
                    if(visitCheck(isVisited,v,set)){
                        return true;
                    }
                }
                else if(set.contains(v)){
                    return true;
                }
            }
        }
        set.remove(i);
        return false;
    }

}
