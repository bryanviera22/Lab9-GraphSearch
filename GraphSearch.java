import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class GraphSearch {
    private static HashMap<Integer, Node> graph = new HashMap<Integer, Node>();

    public GraphSearch() {}

    static class Node{
        private int id;
        private ArrayList<Node> adjacent;

        public Node(int id){
            this.id = id;
            adjacent = new ArrayList<Node>();
        }

        public int getId(){
            return id;
        }

        public ArrayList<Node> getAdjacent(){
            return adjacent;
        }

        public void addAdjacent(Node vertex){
            adjacent.add(vertex);
        }

        public String toString(){
            String msg = "";
            for(Node node: adjacent)
                msg = msg + node.id + " ";
            return msg;
        }
    }

    private static Node getNode(int id){
        if(graph.containsKey(id))
            return graph.get(id);
        else{
            Node node = new Node(id);
            graph.put(id, node);
            return node;
        }
    }

    public void add(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);

        s.addAdjacent(d);
        d.addAdjacent(s);
    }

    public ArrayList<Node> findAdjacent(int index){
        Node node = getNode(index);
        return node.getAdjacent();
    }


    public static void main(String args[]) throws IOException {
        GraphSearch graph = new GraphSearch();

        graph.add(1,2);
        graph.add(2,3);
        graph.add(4,5);
        graph.add(2,5);
        graph.add(6,2);
        graph.add(7,1);
        graph.add(10,2);
        graph.add(3,8);
        graph.add(2,7);
        graph.add(8,7);
        graph.add(8,2);
        graph.add(10,4);
        graph.add(4,3);
        graph.add(3,6);
        graph.add(2, 5);
        graph.add(2,9);
        graph.add(2,4);
        graph.add(5,1);
        graph.add(5,3);
        graph.add(5,9);
        graph.add(6,10);
        graph.add(7,4);
        graph.add(7,10);
        graph.add(7,9);
        graph.add(10, 2);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Search Node: ");
        String inputZ = reader.readLine();
        int z = Integer.parseInt(inputZ);

        ArrayList<Node> adjacent = graph.findAdjacent(z);
        System.out.print("Adjacent of " + z + " are: ");
        for(Node i: adjacent)
            System.out.print(i.getId() + " ");
        System.out.println();

        //Still needs Boolean Functions and Vertices using BFS

        reader.close();

    }
}
