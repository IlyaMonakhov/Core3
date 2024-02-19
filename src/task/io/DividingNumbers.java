package task.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividingNumbers {
    public void dividingNum() throws Exception {
        // TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
        //  исключение, если введены некорректные данные (например, вместо числа введена строка).
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");

        System.out.println("Введите второе целое число: ");


        try {
            int first = input.nextInt();
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


