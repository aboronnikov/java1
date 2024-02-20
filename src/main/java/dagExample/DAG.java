package dagExample;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
class DAG<T> {
    private ArrayList<DAGItem<T>> items;
    private Set<DAGEdge<T>> edges;

    public DAG(List<T> itemVals, Map<Integer, Set<Integer>> edgesMap) {
        items = new ArrayList<>();

        for (T el : itemVals) {
            items.add(new DAGItem<>(el));
        }

        edges = new HashSet<>();
        edgesMap.forEach((k, v) -> v.forEach(s -> addEdge(k, s)));
    }

    public void addEdge(int item1, int item2) {
        edges.add(new DAGEdge<T>(items.get(item1), items.get(item2)));
    }
}
