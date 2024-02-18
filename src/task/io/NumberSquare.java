package task.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSquare {
    public static void squareOfTheNumber() {
        // TODO: Напишите программу, которая считывает число с клавиатуры и выводит его квадрат. Обработайте
        //  исключение, если введено не число
        Scanner console = new Scanner(System.in);
        try {
            System.out.println("Введите число");
            int number = console.nextInt();
            int square = number * number;
            System.out.println(square);
        } catch (InputMismatchException e) {
            System.out.println("Исключение перехвачено");
        }

    }
}
