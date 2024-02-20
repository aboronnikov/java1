package dagExample;

import java.util.*;

public class DAGExample {
    public static void main(String[] args) {
        DAG<String> dag = new DAG<>(List.of("anton", "ilya", "pavel", "maksim"),
                Map.of(0, Set.of(1, 2), 2, Set.of(3)));

        System.out.println("Here we got edges:");
        for (DAGEdge<String> edge : dag.getEdges()) {
            System.out.println(edge.getItem1().getData() + ", " + edge.getItem2().getData());
        }
    }

}



