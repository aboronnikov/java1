package dagExample;

import lombok.Data;

@Data
public class DAGItem<T> {

    private final T data;

}
