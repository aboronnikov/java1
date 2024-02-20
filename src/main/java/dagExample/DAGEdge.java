package dagExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
class DAGEdge<T> {

    private DAGItem<T> item1;
    private DAGItem<T> item2;

}
