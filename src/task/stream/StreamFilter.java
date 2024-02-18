package task.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static List<Integer> filter (List<Integer> listTwelve){
        List<Integer> listFilter = listTwelve.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        return listFilter;
    }
}
