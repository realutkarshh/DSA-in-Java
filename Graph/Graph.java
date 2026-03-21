import java.util.*;

public class Graph<dataType> {
    /*
    Initialize a HashMap that is going to store all the vertices and edges of the graph.
    For example, if the graph looks like this : 

            0 -> 1 -> 2           0 is connected with 1 and 4
            |          \          1 is connected with 2
            4 -> 5      3         2 is connected with 3. 4 is connected with 5

    Then these values will be stored in the hashMap like the following :
        HashMap : Key -> value (HashMap stores everything in a key value pair)
                   0  -> [1,4]
                   1  -> [2]
                   2  -> [3]
                   3  -> []   Empty list means that particular vertice is not connected to any other vertice
                   4  -> [5]
                   5  -> []

        For any Vertex (key), its connected vertices (value) will be stored in a HashSet. This means that,
        For the key 0, the values 1 and 4 (connected vertices to 0) are stored in a HashSet [1,4]. 

        Why HashSet instead of a LinkedList?
        - Prevents duplicate edges automatically
        - Faster lookups
        - Cleaner graph integrity
    */

    //Initialize the Hashmap with name graph.
    private Map<dataType, Set<dataType> > graph = new HashMap<>();


    //Method addVertex to add a vertex with empty list[] into the HashMap.
    public void addVertex(dataType vertex){
        graph.putIfAbsent(vertex, new HashSet<>());
    }

    //Method to add an Edge using source and destination.
    public void addEdge(dataType source, dataType destination, boolean bidirectional){
        addVertex(source);
        addVertex(destination);

        graph.get(source).add(destination);
        if(bidirectional){
            graph.get(destination).add(source);
        }
    }

    //Method to check whether a Vertex exists or not.
    public boolean hasVertex(dataType vertex){
        return graph.containsKey(vertex);
    }

    //Method to check whether an edge exists or not.
    public boolean hasEdge(dataType source, dataType destination){
        //The line below is the perfect line to show why we are using HashSet instead of a LinkedList.
        return graph.containsKey(source) && graph.get(source).contains(destination);
    }

    //Method to calulate number of vertices in the graph.
    public int vertexCount(){
        return graph.size();
    }

    //Method to calculate number of edges in the graph.
    public int edgeCount(boolean bidirectional){
        int count = 0;
        for(dataType vertex: graph.keySet()){
            count += graph.get(vertex).size();
        }

        return bidirectional ? count / 2 : count;
    }


    /*
       DELETE OPERATIONS
    */
   //Method to remove an edge between source and destination.
   public void removeEdge(dataType source, dataType destination, boolean bidirectional){
        if(graph.containsKey(source)){
            graph.get(source).remove(destination);
        }
        if(bidirectional && graph.containsKey(destination)){
            graph.get(destination).remove(source);
        }
   }


   //Method to remove a vertex from a graph.
   public void removeVertex(dataType vertex){
    if(!graph.containsKey(vertex)) return;

    for(dataType neighbour: graph.get(vertex)){
        graph.get(neighbour).remove(vertex);
    }
    graph.remove(vertex);
   }


   /*
        TRAVERSAL TECHNIQUES OF GRAPH 
        - BREADTH FIRST SEARCH (BFS)
        - DEPTH FIRST SEARCH (DFS)
   */

    //Method to implement bfs.
    public List<dataType> BFS(dataType start){
        List<dataType> result = new ArrayList<>();
        if(!graph.containsKey(start)) return result;

        Set<dataType> visited = new HashSet<>();
        Queue<dataType> queue = new LinkedList<>();

        queue.offer(start);
        visited.add(start);

        while(!queue.isEmpty()){
            dataType current = queue.poll();
            result.add(current);

            for(dataType neighbour: graph.get(current)){
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    queue.offer(neighbour);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Graph<Integer> g = new Graph<>();
        g.addVertex(1);
        g.addVertex(2);
        g.addEdge(1, 2, false);

        List<Integer> result = g.BFS(1);
        System.out.println(g.hasEdge(1,3));

    }


}
