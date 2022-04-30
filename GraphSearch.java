import java.util.ArrayList;
import java.util.HashMap;

public class GraphSearch {

    private static HashMap<Integer, Node> graph = new HashMap<Integer, Node>();

    public GraphSearch() {}

    static class Node{

        private int id;
        private ArrayList<Node> adjacent;



    }


        public static void main(String args[]) {
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

    }
}
