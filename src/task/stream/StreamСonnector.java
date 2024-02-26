package task.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamСonnector{
    public String connectingStrings( List<String> listEleven ){
        return listEleven.stream().collect(Collectors.joining());

    }

}
