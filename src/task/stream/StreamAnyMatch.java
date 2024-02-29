package task.stream;

import java.util.List;

public class StreamAnyMatch {
    // TODO: Проверить, содержит ли список определенное значение. Описание: Напишите программу, которая принимает список
    //  элементов и определенное значение в качестве входных данных и проверяет, содержит ли список это значение с использованием
    //  стримов.
    public boolean anyMatch(List<Integer> listSeven, int element){
        return listSeven.stream().anyMatch(e -> e == element);


    }
}
