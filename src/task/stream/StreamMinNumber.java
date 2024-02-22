package task.stream;

import java.util.List;

public class StreamMinNumber {
    // TODO: Найти наименьшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
    //  данных и находит наименьшее число с использованием стримов.
    public int minElement(List<Integer> listSix,int min){
        return min = listSix.stream().min(Integer::compare).orElse(0);

    }
}
