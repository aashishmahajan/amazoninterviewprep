/* http://www.geeksforgeeks.org/detect-cycle-in-a-graph/ */
package geeksforgeekAmazon2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class CycleDetectionInDirectedGraph
{
    private static Graphh graph;

    public boolean isCyclic()
    {

        boolean[] visited = new boolean[graph.vertices];
        Arrays.fill(visited, false);
        Set<Integer> recStack = new HashSet<>();
        for(int i=0;i<graph.vertices;i++)
        {
            if(helper(i, visited, recStack))
                return true;
        }
        return false;
    }

    public boolean helper(int v, boolean[] visited, Set<Integer> recStack)
    {
        if(!visited[v])
        {
            visited[v] = true;
            recStack.add(v);
            for(int i : graph.adj.get(v))
            {
                //if the adjacent node is not visited yet
                if(!visited[i])
                {
                    if(helper(i, visited, recStack))
                        return true;
                }
                //if the node is already present on the recursion stack
                //then there is cycle add return true
                else if(recStack.contains(i))
                    return true;
            }
        }
        //remove the node from the recursion stack
        recStack.remove(v);
        return false;
    }

    public static void main(String args[])
    {
        graph = new Graphh(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        CycleDetectionInDirectedGraph c = new CycleDetectionInDirectedGraph();
        System.out.println(c.isCyclic());
    }
}

class Graphh
{
    int vertices;
    Map<Integer, ArrayList<Integer>> adj;

    Graphh(int v)
    {
        this.vertices = v;
        adj = new HashMap<>();
        for(int i=0; i<v; i++)
        {
            adj.put(i, new ArrayList<Integer>());
        }
    }

    public void addEdge(int a, int b)
    {
        //adding edge from a to b
        this.adj.get(a).add(b);
    }
}