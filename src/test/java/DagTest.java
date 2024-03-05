import dagExample.DAG;
import dagExample.DAGItem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DagTest {
    private static DAGItem<String> anton = new DAGItem<>("anton");
    private static DAGItem<String> ilya = new DAGItem<>("ilya");
    private static DAGItem<String> pavel = new DAGItem<>("pavel");
    private static DAGItem<String> maksim = new DAGItem<>("maksim");

    private static DAG<String> dag;

    @BeforeAll
    public static void init() {
        dag = new DAG<>(List.of(anton, ilya, pavel, maksim))
                .addEdge(anton, ilya)
                .addEdge(pavel, maksim)
                .addEdge(maksim, anton);
    }

    @Test
    public void testTraverse() {
        StringBuilder sb = new StringBuilder();
        dag.traverseItems(pavel, item -> {
            if (sb.length() > 0)
                sb.append(",");
            sb.append(item.getData());
        });

        assertEquals("pavel,maksim,anton,ilya", sb.toString());
    }
}

