package task.stream;

import java.util.List;

public class StreamMaxNumber {
    // TODO: Найти наибольшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
    //  данных и находит наибольшее число с использованием стримов.
    public static int maxElement(List<Integer> listFive){
        Integer max = listFive.stream().max(Integer::compare).get();
        return max;

    }

}
