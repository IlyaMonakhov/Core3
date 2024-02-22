package task.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public List<Integer> listLengths(List<String> listTen,List<Integer> listLength) {
        return listLength = listTen.stream().map(e -> e.length()).collect(Collectors.toList());
    }

}