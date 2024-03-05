package task.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public List<Integer> filter (List<Integer> listTwelve){
        return listTwelve.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

    }
}
