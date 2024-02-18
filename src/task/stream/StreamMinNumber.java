package task.stream;

import java.util.List;

public class StreamMinNumber {
    // TODO: Найти наименьшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
    //  данных и находит наименьшее число с использованием стримов.
    public static int minElement(List<Integer> listSix){
        Integer min = listSix.stream().min(Integer::compare).get();
        return min;

    }
}
