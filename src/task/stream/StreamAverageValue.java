package task.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAverageValue {
    // TODO: Найти среднее значение всех чисел в списке. Описание: Напишите программу, которая принимает список чисел в качестве
    //  входных данных и вычисляет их среднее значение с использованием стримов.
    public int getAverageValue(List<Integer> listSecond){
        int sum = listSecond.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return sum / listSecond.size();
    }

}
