package dagExample;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import com.google.common.collect.ImmutableSet;

import lombok.Data;

@Data
public class DAG<T> {
    private final ImmutableSet<DAGItem<T>> items;
    private final ImmutableSet<DAGEdge<T>> edges;

    public DAG() {
        this.items = ImmutableSet.of();
        this.edges = ImmutableSet.of();
    }

    public DAG(Collection<DAGItem<T>> items) {
        this(items, List.of());
    }

    public DAG(Collection<DAGItem<T>> items, Collection<DAGEdge<T>> edges) {
        this(ImmutableSet.copyOf(items), ImmutableSet.copyOf(edges));
    }

    public DAG(ImmutableSet<DAGItem<T>> items, ImmutableSet<DAGEdge<T>> edges) {
        this.items = items;
        this.edges = edges;
    }

    public DAG<T> addEdge(DAGItem<T> item1, DAGItem<T> item2) {
        return new DAG<>(
                this.items,
                ImmutableSet.<DAGEdge<T>>builder()
                        .addAll(this.edges)
                        .add(new DAGEdge<>(item1, item2)).build());
    }

    public void traverseItems(Consumer<DAGItem<T>> consumer) {
        // TODO
    }
}
