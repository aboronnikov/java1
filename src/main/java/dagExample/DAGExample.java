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

        System.out.println("Here we got items:");
        dag.traverseItems((item) -> System.out.println("Item " + item.getData()));
    }

}
