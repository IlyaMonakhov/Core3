package task.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividingNumbers {
    public void undressedFirstAndSecondNumber() throws Exception {
        // TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
        //  исключение, если введены некорректные данные (например, вместо числа введена строка).
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите первое целое число: ");
            int first = input.nextInt();
            System.out.println("Введите второе целое число: ");
            int second = input.nextInt();
            int result = first / second;

            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя");
        } catch (InputMismatchException e) {
            System.out.println("Не верный формат");
        }

    }
}


