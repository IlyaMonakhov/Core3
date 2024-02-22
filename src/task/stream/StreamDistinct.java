package task.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

    public List<Integer> distinctNumber(List<Integer> listEight,List<Integer> listDistinct) {
        return listDistinct = listEight.stream().distinct().collect(Collectors.toList());

    }
}
