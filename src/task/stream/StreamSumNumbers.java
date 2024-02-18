package task.stream;

import java.util.List;

public class StreamSumNumbers {
    // TODO: Найти сумму всех чисел в списке. Описание: Напишите программу, которая принимает список целых чисел в качестве
    //  входных данных и вычисляет их сумму с использованием стримов.
    public static int sumNumbers( List<Integer> integers){
        int sum = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return sum;
    }
}
