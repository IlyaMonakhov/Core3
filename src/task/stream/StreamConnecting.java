package task.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamConnecting {
    public String connectingStrings( List<String> listEleven){
        String result = listEleven.stream().collect(Collectors.joining());
        return result;
    }

}
