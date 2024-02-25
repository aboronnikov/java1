package dagExample;

import lombok.Data;

@Data
public class DAGEdge<T> {

    private final DAGItem<T> item1;
    private final DAGItem<T> item2;

}
