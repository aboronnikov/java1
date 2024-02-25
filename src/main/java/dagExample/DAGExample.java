package dagExample;

import java.util.List;

public class DAGExample {
    public static void main(String[] args) {
        var anton = new DAGItem<>("anton");
        var ilya = new DAGItem<>("ilya");
        var pavel = new DAGItem<>("pavel");
        var maksim = new DAGItem<>("maksim");

        var dag = new DAG<>(List.of(anton, ilya, pavel, maksim))
                .addEdge(anton, ilya)
                .addEdge(pavel, maksim)
                .addEdge(maksim, anton);

        System.out.println("Here we got edges:");
        for (DAGEdge<String> edge : dag.getEdges()) {
            System.out.println(edge.getItem1().getData() + ", " + edge.getItem2().getData());
        }
    }

}
